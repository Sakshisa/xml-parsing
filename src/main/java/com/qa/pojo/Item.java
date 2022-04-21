package com.qa.pojo;

public class Item {
	private String OrderTime;

	private String LiquorTax;

	private String ItemOrderType;

	private String FoodTax;

	private double ItemPrice;

	private String SeqNumber;

	private String ItemID;

	private String RestaurantNumber;

	private String CheckID;

	private String ItemQuantity;

	private String MenuItemID;

	private String ItemName;

	private String ReductionCode;

	private String LineType;

	public String getOrderTime() {
		return OrderTime;
	}

	public void setOrderTime(String OrderTime) {
		this.OrderTime = OrderTime;
	}

	public String getLiquorTax() {
		return LiquorTax;
	}

	public void setLiquorTax(String LiquorTax) {
		this.LiquorTax = LiquorTax;
	}

	public String getItemOrderType() {
		return ItemOrderType;
	}

	public void setItemOrderType(String ItemOrderType) {
		this.ItemOrderType = ItemOrderType;
	}

	public String getFoodTax() {
		return FoodTax;
	}

	public void setFoodTax(String FoodTax) {
		this.FoodTax = FoodTax;
	}

	public double getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(double ItemPrice) {
		this.ItemPrice = ItemPrice;
	}

	public String getSeqNumber() {
		return SeqNumber;
	}

	public void setSeqNumber(String SeqNumber) {
		this.SeqNumber = SeqNumber;
	}

	public String getItemID() {
		return ItemID;
	}

	public void setItemID(String ItemID) {
		this.ItemID = ItemID;
	}

	public String getRestaurantNumber() {
		return RestaurantNumber;
	}

	public void setRestaurantNumber(String RestaurantNumber) {
		this.RestaurantNumber = RestaurantNumber;
	}

	public String getCheckID() {
		return CheckID;
	}

	public void setCheckID(String CheckID) {
		this.CheckID = CheckID;
	}

	public String getItemQuantity() {
		return ItemQuantity;
	}

	public void setItemQuantity(String ItemQuantity) {
		this.ItemQuantity = ItemQuantity;
	}

	public String getMenuItemID() {
		return MenuItemID;
	}

	public void setMenuItemID(String MenuItemID) {
		this.MenuItemID = MenuItemID;

	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}

	public String getReductionCode() {
		return ReductionCode;
	}

	public void setReductionCode(String ReductionCode) {
		this.ReductionCode = ReductionCode;
	}

	public String getLineType() {
		return LineType;
	}

	public void setLineType(String LineType) {
		this.LineType = LineType;
	}

	public Item(double itemPrice2, String ItemID, String RestaurantNumber, String ItemQuantity, String ItemName, String LineType ) {

		this.ItemPrice = itemPrice2;
		this.ItemID= ItemID;
		this.RestaurantNumber= RestaurantNumber;

		this.ItemQuantity= ItemQuantity;
		this.ItemName= ItemName;
		this.LineType= LineType;
		
		
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
		return "[ItemPrice = " + ItemPrice + ", ItemID = " + ItemID + ", RestaurantNumber = "
				+ RestaurantNumber + ", CheckID = " + CheckID + ", " + "ItemQuantity = " + ItemQuantity
				+ ",  ItemName = " + ItemName + ", LineType = " + LineType + "]";
	}
}