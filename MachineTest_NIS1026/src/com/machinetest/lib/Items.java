package com.machinetest.lib;

public class Items extends Category{
	
	//initializing Variable
	private int itemId;
	private String itemName;
	private double buyingPrice;
	private double sellingPrice;
	private double taxPercentage;
	


	private int quantity;
	
	//default Constructor
	public Items() {
		
	}
	//Parameterized constructor
	public Items(int categoryId, int itemId,
			String itemName, double buyingPrice, double sellingPrice,
			double taxPercentage, int quantity) {
		super(categoryId);
		this.itemId = itemId;
		this.itemName = itemName;
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		this.taxPercentage = taxPercentage;
		this.quantity = quantity;
	}

	//Parameterized constructor item id
	public Items(int itemId) {
		super();
		this.itemId = itemId;
	}
	
	//Parameterized constructor item name
	public Items(String itemName) {
		super();
		this.itemName = itemName;
	}

	
	//getter and Setters
	public int getItemId() {
		return itemId;
	}

	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	public double getBuyingPrice() {
		return buyingPrice;
	}

	
	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	
	public double getSellingPrice() {
		return sellingPrice;
	}

	
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	
	public double getTaxPercentage() {
		return taxPercentage;
	}

	
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	
	public int getQuantity() {
		return quantity;
	}

	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//to string
	public String toString() {
		return  "========================================\n"+"\t\t"+"Items Details\n========================================\n"
					+"\t"+"Item ID : " +"\t\t"
				+ itemId + "\n"+"\t"+"Item Name : " +"\t\t"+ itemName
				+ "\n"+"\t"+"Buying Price : "+"\t\t" + buyingPrice + "\n"+"\t"+"Selling Price : "
				+"\t"+ sellingPrice + "\n"+"\t"+"Tax in Percentage : " +"\t"+ taxPercentage
				+ "\n"+"\t"+"Tolat Quantity : " +"\t"+ quantity +"\n========================================\n"+"\t"+ super.toString()  ;
	}
	
	
	

}
