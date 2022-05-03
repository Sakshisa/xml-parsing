package com.qa.test;

import java.awt.desktop.SystemSleepEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import com.qa.pojo.Check;
import com.qa.pojo.Employee;
import com.qa.pojo.Item;
import com.qa.pojo.TMap;

public class EmployeeBaseData {

	static HashMap<String, Item> priceSum;
	static HashMap<String, Object> checkCountMap;

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		// HashMap<String, Object> priceSum = new HashMap<String, Object>();
		priceSum = new HashMap<String, Item>();
		List<Check> check = new ArrayList<Check>();
		List<Employee> emp = new ArrayList<Employee>();

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		File dir1 = new File("/Users/sourabhsharma/eclipse-workspace/XmlParsing/NewFile.xml");

		String dir = dir1.getAbsolutePath();
		/*
		 * if (dir.exists() && dir.isDirectory()) { //File[] files = dir.listFiles((d,
		 * name) -> name.endsWith(".xml")); //if (files != null) { // for (File file :
		 * files) { // String path = file.getAbsolutePath(); //
		 * System.out.println("PATH..... " + path);
		 */
		Document document = builder.parse(new File(dir));

		NodeList nList = document.getElementsByTagName("Check");
		// System.out.println("No. of Checks : " + nList.getLength());

		for (int temp = 0; temp < nList.getLength(); temp++) {
			List<Item> item = new ArrayList<Item>();
			Node nNode = nList.item(temp);
			System.out.println("TEST...........");
			System.out.println("Node........ + " + nNode.getNodeValue());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				String CheckID = eElement.getElementsByTagName("CheckID").item(0).getTextContent();
				String SystemGuestCount = eElement.getElementsByTagName("SystemGuestCount").item(0).getTextContent();
				double guestCount = Double.parseDouble(SystemGuestCount);
				String EmployeeName = eElement.getElementsByTagName("EmployeeName").item(0).getTextContent();
				String EmployeeId = eElement.getElementsByTagName("EmployeeId").item(0).getTextContent();

				NodeList list = eElement.getElementsByTagName("Item");

				System.out.println("Total Item count in CheckId : " + CheckID + " ------ " + list.getLength());

				int itemcount = list.getLength();
				for (int i = 0; i < itemcount; i++) {
					String price = eElement.getElementsByTagName("ItemPrice").item(i).getTextContent();
					double ItemPrice = Double.parseDouble(price);
					System.out.println("ITEM PRICE..............................." + ItemPrice);
					String ItemID = eElement.getElementsByTagName("ItemID").item(i).getTextContent();
					String RestaurantNumber = eElement.getElementsByTagName("RestaurantNumber").item(i)
							.getTextContent();
					String ItemQuantity1 = eElement.getElementsByTagName("ItemQuantity").item(i).getTextContent();
					int ItemQuantity = Integer.parseInt(ItemQuantity1);
					String ItemName = eElement.getElementsByTagName("ItemName").item(i).getTextContent();
					String LineType = eElement.getElementsByTagName("LineType").item(i).getTextContent();

					item.add(new Item(ItemPrice, ItemID, RestaurantNumber, ItemQuantity, ItemName, LineType));

				}

				// System.out.println("item List : " + list);

				check.add(new Check(CheckID, EmployeeName, EmployeeId, guestCount, item));

			}

		}

		// ArrayList<Object> list1 = new ArrayList();
		String EmpName = null;

		int checkCount = 0;

		double total = 0;
		for (Check empl : check) {
			double sum = 0;
			int quantity = 0;
			int quant = 0;

			System.out.println("ITEM IN XML FILE...............");
			EmpName = empl.getEmployeeName();
			String checkID = empl.getCheckID();
			System.out.println("CHECK ID ......" + checkID);
			String EmployeeId = empl.getEmployeeId();
			double SystemGuestCount = empl.getSystemGuestCount();

			System.out.println("EMP NAME : " + empl.getEmployeeName());

			List<Item> it = empl.getItem();
			int itemsize = it.size();
			System.out.println("ItemSize " + itemsize);
			for (int i = 0; i < itemsize; i++) {
				// System.out.println(it.get(i));
				double ItemPrice = it.get(i).getItemPrice();
				int ItemQun = it.get(i).getItemQuantity();
				quantity = quantity + ItemQun;

				System.out.println("QQQQ " + quantity);

				sum = sum + ItemPrice;

			}
			Item item = new Item(sum, quantity);

			System.out.println("Quanity:..... " + quantity);
			// emp.add(new Employee(checkID, EmpName, EmployeeId, SystemGuestCount, it));

			double update;
			System.out.println("ITEM COST...." + sum);
			if (!priceSum.containsKey(EmpName)) {
				priceSum.put(EmpName, item);
			} else {

				Item val = priceSum.get(EmpName);
				sum = sum + val.getItemPrice();
				quantity = quantity + val.getItemQuantity();
				Item item1 = new Item(sum, quantity);

				// https://stackoverflow.com/questions/12516682/hashmapstring-object-how-to-replace-1-value-of-the-object
				//https://www.programiz.com/java-programming/examples/update-hashmap-value

				priceSum.put(EmpName, item1);

			}

		}

		checkCount = checkCount + 1;

		System.out.println("NO. of CHECK of    " + EmpName + checkCount);

		Iterator<Entry<String, Item>> iterator = priceSum.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Item> pair = iterator.next();
			System.out.println("EmpName: " + pair.getKey() + "     Sales : " + pair.getValue());

		}
	}
}
