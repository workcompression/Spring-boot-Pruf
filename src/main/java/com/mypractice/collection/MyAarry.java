package com.mypractice.collection;

import java.util.ArrayList;
import java.util.List;

public class MyAarry {
	public static void main(String[] args) {
		
	
	
	List<String> list=new ArrayList<String>();
	list.add("10");
	list.add("20");
	list.add("30");
	System.out.println(list);
	
	list.add(1, "40");
	System.out.println(list);
	
	List<String> newlist=new ArrayList<String>();
	newlist.add("200");
	newlist.add("300");
	
	list.addAll(newlist);
	System.out.println(list);
	
	System.out.println(list.get(3));
	
	list.remove(3);
	
	System.out.println(list);
	
	list.remove(String.valueOf("40"));
	System.out.println(list);
	
	//list.clear();
//	System.out.println(list);
	
	list.set(3, "30");
	System.out.println(list);
	
  System.out.println(list.contains("200"));
  
  for(int i=0;i<=list.size();i++) {
	  System.out.println("get all elements"+list.get(i));
  
 // for (list elements : Arry) {
	
}
  for(String elements:list) {
	  
  }
	}
}
