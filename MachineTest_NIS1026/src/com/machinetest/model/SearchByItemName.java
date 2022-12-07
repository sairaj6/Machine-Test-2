package com.machinetest.model;

import java.util.List;

import com.machinetest.lib.Items;

public class SearchByItemName {

	public static void search(String name, List<Items> itemList) {
		for(Items item : itemList)
		{
			if(name.equalsIgnoreCase(item.getItemName()))
			System.out.println(item);
		}
		
	}

}
