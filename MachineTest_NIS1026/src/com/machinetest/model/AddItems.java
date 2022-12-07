package com.machinetest.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.machinetest.lib.Items;

public class AddItems {
	
	public static Scanner scanner = new Scanner(System.in);
	public static Items items = new Items();
	
	
	
	public static List<Items> itemList = new ArrayList<>();
	
	public static void getItem()
	{
		//initializing variables
		 int itemCode;
		 String itemName;
		 double buyingPrice;
		 double sellingPrice;
		 double taxPercentage;
		 int quantity;
		 int categoryId;
		
		try {
			
			boolean dowhileflag = true;
			do {
				System.out.println("Select Operation to perform");
				System.out.println("1. To Insert Item");
				System.out.println("2. Print all Items");
				System.out.println("3. Search Product By Category");
				System.out.println("4. Search Product By Item Code");
				System.out.println("5. Search Product By Item Name");
				System.out.println("6. To Exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					//accepting data 
						System.out.println("Enter list Items");
						System.out.println("Enter Item Code : ");
						itemCode = scanner.nextInt();						
						
						System.out.println("Enter Item Name : ");
						itemName = scanner.next();
						
						System.out.println("Enter Buying Price : ");
						buyingPrice = scanner.nextDouble();
						
						System.out.println("Enter Selling Price : ");
						sellingPrice = scanner.nextDouble();
						
						System.out.println("Enter Tax in Percentage : ");
						taxPercentage = scanner.nextDouble();
						
						System.out.println("Enter Quantity");
						quantity = scanner.nextInt();
						
						System.out.println("Enter Category ID\n1. Cameras\n2. Laptops\n3. Watches\n4. Mobile Phones");
						categoryId = scanner.nextInt();
						
						
						/*for (Items item : itemList) {
							
							if(item.getItemId() == itemCode)
							{
								System.out.println("Item Already Exists Add Another Item");
								break;
							}
							else
							{
								itemList.add(new Items(categoryId, itemCode,itemName,buyingPrice,sellingPrice,taxPercentage, quantity));
								break;
							}
							
						}*/
						//itemList.add(new Items(categoryId, itemCode,itemName,buyingPrice,sellingPrice,taxPercentage, quantity));
						
						//checking item code
						if(!itemList.contains(items.getItemId()))
						{
							itemList.add(new Items(categoryId, itemCode,itemName,buyingPrice,sellingPrice,taxPercentage, quantity));
						}
						else
						{
							System.out.println("Item Already Exists Add Another Item");
						}
					
					break;
				case 2:
					//printing list
					for(Items item : itemList)
					{
						System.out.println(item);
					}
					break;
				case 3:
					//search by category
					System.out.println("Enter Item Category : ");
					String category = scanner.next();
					SearchByCategory.search(category , itemList);
					
					break;
				case 4:
					//search by Item Code
					System.out.println("Enter Item Code : ");
					Integer code = scanner.nextInt();
					SearchByItemCode.search(code , itemList);

					break;
				case 5:
					//Search by Item Name
					System.out.println("Enter Item Name : ");
					String name = scanner.next();
					SearchByItemName.search(name , itemList);
					
					break;
				case 6:
					dowhileflag = false;
					break;

				default:
					System.out.println("Select Proper Choice");
					break;
				}
				
				
			} while (dowhileflag);
			
			
			System.out.println(itemList.get(0));
			System.out.println(itemList.get(1));
			
			
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("Please Insert Correct Data");
		}
		
	}

	private static boolean isItemPresent(int _itemCode) {
		if(itemList.contains(_itemCode))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
