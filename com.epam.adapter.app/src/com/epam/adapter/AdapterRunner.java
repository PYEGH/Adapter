package com.epam.adapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdapterRunner {

	public static void main(String[] args) {
		String str1 = "1";
		String str2 = "2";
		String str3 = "3";
		
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		BaseList list = new ListAdapter(arrayList);
		list.push(str1);
		list.push(str2);
		list.pop();
		list.pop();
		
		list = new ListAdapter(linkedList);
		list.push(str1);
		list.push(str3);
		list.pop();
		list.pop();
	}

}
