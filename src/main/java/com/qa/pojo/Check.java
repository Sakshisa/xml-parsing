package com.qa.pojo;

import java.util.List;

public class Check {
	private String CheckSalesTotal;

	private String CheckClosedTime;

	private String CheckTaxTotal;

	private String ServerGuestCount;

	private List<Item> Item;

	private String RestaurantNumber;

	private Payment Payment;

	private String SystemGuestCount;

	private String CheckID;

	private String CheckOrderType;

	private String EmployeeId;

	private String CheckOpenedTime;

	private String EmployeeName;

	public String getCheckSalesTotal() {
		return CheckSalesTotal;
		
	}

	public void setCheckSalesTotal(String CheckSalesTotal) {
		this.CheckSalesTotal = CheckSalesTotal;
	}

	public String getCheckClosedTime() {
		return CheckClosedTime;
	}

	public void setCheckClosedTime(String CheckClosedTime) {
		this.CheckClosedTime = CheckClosedTime;
	}

	public String getCheckTaxTotal() {
		return CheckTaxTotal;
	}

	public void setCheckTaxTotal(String CheckTaxTotal) {
		this.CheckTaxTotal = CheckTaxTotal;
	}

	public String getServerGuestCount() {
		return ServerGuestCount;
	}

	public void setServerGuestCount(String ServerGuestCount) {
		this.ServerGuestCount = ServerGuestCount;
	}

	public List<com.qa.pojo.Item> getItem() {
		return Item;
	}

	public void setItem(Item Item) {
		this.Item = (List<com.qa.pojo.Item>) Item;
	}

	public String getRestaurantNumber() {
		return RestaurantNumber;
	}

	public void setRestaurantNumber(String RestaurantNumber) {
		this.RestaurantNumber = RestaurantNumber;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	public String getSystemGuestCount() {
		return SystemGuestCount;
	}

	public void setSystemGuestCount(String SystemGuestCount) {
		this.SystemGuestCount = SystemGuestCount;
	}

	public String getCheckID() {
		return CheckID;
	}

	public void setCheckID(String CheckID) {
		this.CheckID = CheckID;
	}

	public String getCheckOrderType() {
		return CheckOrderType;
	}

	public void setCheckOrderType(String CheckOrderType) {
		this.CheckOrderType = CheckOrderType;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String EmployeeId) {
		this.EmployeeId = EmployeeId;
	}

	public String getCheckOpenedTime() {
		return CheckOpenedTime;
	}

	public void setCheckOpenedTime(String CheckOpenedTime) {
		this.CheckOpenedTime = CheckOpenedTime;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	public Check(String CheckID, String EmployeeName, String EmployeeId, List<Item> item) {
		this.CheckID = CheckID;
		this.EmployeeName = EmployeeName;
		this.EmployeeId = EmployeeId;
		this.Item= item;

	}
	
	@Override
	public String toString() {
	 return "CheckID : " + CheckID + ", " + "EmployeeName :  " + ", " + EmployeeName + ", " + "EmployeeId : " + EmployeeId ;
    }
 
}


	
	

	/*
	 * @Override public String toString() { return "ClassPojo [CheckSalesTotal = " +
	 * CheckSalesTotal + ", CheckClosedTime = " + CheckClosedTime +
	 * ", CheckTaxTotal = " + CheckTaxTotal + ", ServerGuestCount = " +
	 * ServerGuestCount + ", Item = " + Item + ", RestaurantNumber = " +
	 * RestaurantNumber + ", Payment = " + Payment + ", SystemGuestCount = " +
	 * SystemGuestCount + ", CheckID = " + CheckID + ", CheckOrderType = " +
	 * CheckOrderType + ", EmployeeId = " + EmployeeId + ", CheckOpenedTime = " +
	 * CheckOpenedTime + ", EmployeeName = " + EmployeeName + "]"; }
	 */

