package com.training.jdbc;

public class Product {

//	create table  product(prod_id varchar(6) not null,
//            prod_name varchar(6) not null,
//            prod_desc varchar(20),
//            price numeric(8,2) not null);
	
	String prod_id;
	String prod_name;
	String prod_desc;
	Double price;
	/**
	 * @param prod_id
	 * @param prod_name
	 * @param prod_desc
	 * @param price
	 */
	public Product(String prod_id, String prod_name, String prod_desc, Double price) {
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.price = price;
	}
	/**
	 * @return the prod_id
	 */
	public String getProd_id() {
		return prod_id;
	}
	/**
	 * @param prod_id the prod_id to set
	 */
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	/**
	 * @return the prod_name
	 */
	public String getProd_name() {
		return prod_name;
	}
	/**
	 * @param prod_name the prod_name to set
	 */
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	/**
	 * @return the prod_desc
	 */
	public String getProd_desc() {
		return prod_desc;
	}
	/**
	 * @param prod_desc the prod_desc to set
	 */
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
