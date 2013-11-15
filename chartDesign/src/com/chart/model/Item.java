package com.chart.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Item<T extends ISeries> implements Serializable {

	private List<T> pts = new ArrayList<T>();
	int length = 0;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
		
	public void addValues(T t){
		pts.add(t);
	}
	
	public void removeAt(int loc){
		pts.remove(loc);
	}
	
	public void clear(){
		pts.clear();
	} 
		
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for(T t : pts){
			sb.append(t.toString() + "\n");
		}
		
		return sb.toString();
	}
	
	
}

