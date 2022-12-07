package com.machinetest.lib;

public class Category {
	private int categoryId;
	private String categoryName;
	
	//default Constructor
	public Category() {
		
	}
	
	//Parameterized constructor
	public Category(int categoryId) {
		super();
		this.categoryId = categoryId;
		if(categoryId == 1)
		{
			this.categoryName = "Camera";
		}
		else if(categoryId == 2)
		{
			this.categoryName = "Laptop";
		}
		else if(categoryId == 3)
		{
			this.categoryName = "Watche";
		}
		else {
			this.categoryName = "Mobile Phone";
		}
		
	}


	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	//to strings
	public String toString() {
		return "\t"+"Category Details\n========================================\n"+"\t"+"Category ID : "
				+"\t\t"+ categoryId + "\n"+"\t"+"Category Name : "
				+"\t"+ categoryName + "\n========================================\n";
	}
	
	

}
