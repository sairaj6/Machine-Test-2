package com.machinetest.model;

import java.util.List;

import com.machinetest.lib.Items;

public class SearchByItemCode {

	public static void search(Integer code, List<Items> itemList) {
		
		for(Items item : itemList)
		{
			if(code.equals(item.getItemId()))
			System.out.println(item);
		}
		
	}

}
