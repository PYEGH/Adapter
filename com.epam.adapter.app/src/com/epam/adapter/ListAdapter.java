package com.epam.adapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAdapter implements BaseList {
	private List list;

	public ListAdapter(List list) {
		this.list = list;
	}

	@Override
	public void push(final Object object) {
		if(this.list instanceof ArrayList){			
			this.list.add(this.list.size(), object);
			System.out.println("AL push: " + object.toString());
		} else if(this.list instanceof LinkedList){
			((LinkedList) this.list).addLast(object);
			System.out.println("LL push: " + object.toString());
		}
	}

	@Override
	public Object pop() {
		if(this.list instanceof ArrayList){
			System.out.println("AL pop: " + this.list.get(this.list.size() - 1).toString());
			return this.list.get(this.list.size() - 1);
		} else if(this.list instanceof LinkedList){
			System.out.println("LL pop: " + this.list.get(this.list.size() - 1).toString());
			return ((LinkedList) this.list).getLast();
		}
		return null;
	}

}
