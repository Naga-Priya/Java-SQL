package com.training.jdbc;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{

	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getPrice().compareTo(o2.getPrice());
	}
	
	

}
