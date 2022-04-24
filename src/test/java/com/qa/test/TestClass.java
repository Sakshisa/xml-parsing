package com.qa.test;

import java.awt.GraphicsConfigTemplate;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import com.qa.pojo.Check;
import com.qa.pojo.Item;

public class TestClass {

	static HashMap<String, Object> priceSum;
	static HashMap<String, Object> checkCountMap;

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		// HashMap<String, Object> priceSum = new HashMap<String, Object>();
		priceSum = new HashMap<String, Object>();

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		// Document document = builder.parse(new File("NewFile.xml"));
		// https://stackoverflow.com/questions/48883762/how-to-read-multiple-xml-files-in-java
		File dir = new File("/Users/sourabhsharma/Downloads/97023");
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles((d, name) -> name.endsWith(".xml"));
			if (files != null) {
				for (File file : files) {
					String path = file.getAbsolutePath();
					System.out.println("PATH..... " + path);

					// String xml = new String(Files.readAllBytes(file.toPath()),
					// Charset.defaultCharset());
					// System.out.println("XML ........" + xml);
					Document document = builder.parse(new File(path));

					List<Check> check = new ArrayList<Check>();

					// System.out.println("Root element :" +
					// document.getDocumentElement().getNodeName());

					NodeList nList = document.getElementsByTagName("Check");
					// System.out.println("No. of Checks : " + nList.getLength());

					for (int temp = 0; temp < nList.getLength(); temp++) {
						List<Item> item = new ArrayList<Item>();
						Node nNode = nList.item(temp);
						// System.out.println("Current Element :" + nNode.getNodeName());

						if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement = (Element) nNode;
							String CheckID = eElement.getElementsByTagName("CheckID").item(0).getTextContent();
							String EmployeeName = eElement.getElementsByTagName("EmployeeName").item(0)
									.getTextContent();
							String EmployeeId = eElement.getElementsByTagName("EmployeeId").item(0).getTextContent();
							// System.out.println("EmployeeName in the File : "
							// + eElement.getElementsByTagName("EmployeeName").item(0).getTextContent());
							// System.out.println("EmployeeId in the File : "
							// + eElement.getElementsByTagName("EmployeeId").item(0).getTextContent());

							NodeList list = eElement.getElementsByTagName("Item");

							System.out.println(
									"Total Item count in CheckId : " + CheckID + " ------ " + list.getLength());

							int itemcount = list.getLength();
							for (int i = 0; i < itemcount; i++) {
								String price = eElement.getElementsByTagName("ItemPrice").item(i).getTextContent();
								double ItemPrice = Double.parseDouble(price);
								System.out.println("ITEM PRICE..............................." + ItemPrice);
								String ItemID = eElement.getElementsByTagName("ItemID").item(i).getTextContent();
								String RestaurantNumber = eElement.getElementsByTagName("RestaurantNumber").item(i)
										.getTextContent();
								String ItemQuantity = eElement.getElementsByTagName("ItemQuantity").item(i)
										.getTextContent();
								String ItemName = eElement.getElementsByTagName("ItemName").item(i).getTextContent();
								String LineType = eElement.getElementsByTagName("LineType").item(i).getTextContent();
								item.add(new Item(ItemPrice, ItemID, RestaurantNumber, ItemQuantity, ItemName,
										LineType));

							}

							// System.out.println("item List : " + list);

							check.add(new Check(CheckID, EmployeeName, EmployeeId, item));

						}

					}

					// ArrayList<Object> list1 = new ArrayList();
					String EmpName = null;

					int checkCount = 0;
					double total = 0;
					for (Check empl : check) {
						double sum = 0;

						System.out.println("ITEM IN XML FILE...............");
						EmpName = empl.getEmployeeName();
						String checkID = empl.getCheckID();
						System.out.println("CHECK ID ......" + checkID);

						System.out.println("EMP NAME : " + empl.getEmployeeName());

						List<Item> it = empl.getItem();
						int itemsize = it.size();
						System.out.println("ItemSize " + itemsize);
						for (int i = 0; i < itemsize; i++) {
							// System.out.println(it.get(i));
							double ItemPrice = it.get(i).getItemPrice();
							// double price = Integer.parseInt(ItemPrice);
							sum = sum + ItemPrice;
							System.out.println("SUM.." + sum);

						}
						// checkCount = checkCount + 1;

						// checkCountMap = new HashMap<String, Object>();

						double update;
						System.out.println("ITEM COST...." + sum);
						if (!priceSum.containsKey(EmpName)) {
							priceSum.put(EmpName, sum);
						} else {
							// update=0;
							update = (Double) priceSum.get(EmpName);
							update = update + sum;
							System.out.println(
									"UPDATE................................................................................"
											+ update);

							priceSum.put(EmpName, update);
						}

					}

					// https://stackoverflow.com/questions/14110924/how-to-get-hashmap-object-value
					// https://www.youtube.com/watch?v=3hultwSw_nU
					// https://stackoverflow.com/questions/33243007/iterating-through-object-in-hashmap
					// https://stackoverflow.com/questions/38393409/how-to-make-nested-hashmap-in-java

					Iterator<Entry<String, Object>> iterator = priceSum.entrySet().iterator();
					while (iterator.hasNext()) {
						Entry<String, Object> pair = iterator.next();
						System.out.println("EmpName: " + pair.getKey() + "     Sales : " + pair.getValue());

						// System.out.format("EmpName: , Total Sales: ", pair.getKey(),
						// pair.getValue());

					}
				}
			}
		}
	}

}
