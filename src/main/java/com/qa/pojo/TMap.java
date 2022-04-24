package com.qa.pojo;

public class TMap {

	private int sum;

	private String checkID;
	private String OrderTime;

	public int getsum() {
		return sum;
	}

	public void setOrderTime(String OrderTime) {
		this.OrderTime = OrderTime;
	}

	public String getcheckID() {
		return checkID;
	}

	public void setcheckID(String checkID) {
		this.checkID = checkID;
	}

	public TMap(int sum, String checkID) {

		this.sum = sum;
		this.checkID = checkID;

	}
	
	public TMap(int sum, String checkID, String OrderTime ){

		this.sum = sum;
		this.checkID = checkID;
		this.OrderTime= OrderTime;

	}
	/*
	 * @Override public String toString() { return
	 * "ClassPojo [OrderTime = "+OrderTime+", LiquorTax = "
	 * +LiquorTax+", ItemOrderType = "+ItemOrderType+", FoodTax = "
	 * +FoodTax+", ItemPrice = "+ItemPrice+", SeqNumber = "+SeqNumber+", ItemID = "
	 * +ItemID+", RestaurantNumber = "+RestaurantNumber+", CheckID = "
	 * +CheckID+", ItemQuantity = "+ItemQuantity+", MenuItemID = "
	 * +MenuItemID+", ItemName = "+ItemName+", ReductionCode = "
	 * +ReductionCode+", LineType = "+LineType+"]"; }
	 */

	public String toString() {
		return "[sum = " + sum + ", ItemID = " 
				+ ", CheckID = " + checkID + "]";
	}

}
