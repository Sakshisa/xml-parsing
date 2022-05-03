package com.qa.pojo;

import java.util.List;

public class Employee {

	private String CheckID;
	private List<Item> Item;

	private String SystemGuestCount;

	private String EmployeeName;
	private String EmployeeId;

	public String getCheckID() {
		return CheckID;
	}

	public void setCheckID(String CheckID) {
		this.CheckID = CheckID;
	}

	public List<com.qa.pojo.Item> getItem() {
		return Item;
	}

	public void setItem(Item Item) {
		this.Item = (List<com.qa.pojo.Item>) Item;
	}

	public String getSystemGuestCount() {
		return SystemGuestCount;
	}

	public void setSystemGuestCount(String SystemGuestCount) {
		this.SystemGuestCount = SystemGuestCount;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String EmployeeId) {
		this.EmployeeId = EmployeeId;
	}

	public Employee(String CheckID, String EmployeeName, String EmployeeId, String SystemGuestCount, List<Item> item) {
		this.CheckID = CheckID;
		this.EmployeeName = EmployeeName;
		this.EmployeeId = EmployeeId;
		this.SystemGuestCount = SystemGuestCount;
		this.Item = item;

	}

	@Override
	public String toString() {
		return "CheckID : " + CheckID + ", " + "EmployeeName :  " + ", " + EmployeeName + ", " + "EmployeeId : "
				+ EmployeeId + "String SystemGuestCount " + SystemGuestCount + "Item" + Item;
	}

}
