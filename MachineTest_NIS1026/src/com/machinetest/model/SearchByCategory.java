package com.machinetest.model;

import java.util.List;

import com.machinetest.lib.Items;

public class SearchByCategory {
	

	public static void search(String category, List<Items> itemList) {
		for(Items item : itemList)
		{
			if(category.equalsIgnoreCase(item.getCategoryName()))
			System.out.println(item);
		}
		
	}
	
}
