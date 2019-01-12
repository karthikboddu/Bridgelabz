package com.bridgelabz.objectoriented;

import com.bridgelabz.utility.Utility;

public class InventoryData {

	public static void main(String[] args) {
		String file = "inventory.json";
		String opfile=Utility.readJson(file);
		System.out.println(opfile);
	}
	
	private String name;
	private int weight;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString(){
	      return "stock  name: " +name+   "  weight: " + weight+ " ,price:" +price+  "";
	   }

}
