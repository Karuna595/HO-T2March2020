package com.mastek.inventorymgmt.model;

public class Product 
{
	private String product_id;
	private String product_name;
	private double unit_price;
	private int available_qty;
	
	public Product() {
		super();
	}
	
	
	public Product(String product_id, String product_name, double unit_price, int available_qty) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.unit_price = unit_price;
		this.available_qty = available_qty;
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public double getUnit_price() {
		return unit_price;
	}


	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}


	public int getAvailable_qty() {
		return available_qty;
	}


	public void setAvailable_qty(int available_qty) {
		this.available_qty = available_qty;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product_id == null) ? 0 : product_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (product_id == null) {
			if (other.product_id != null)
				return false;
		} else if (!product_id.equals(other.product_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [product_id =" + product_id + ", product_name=" + product_name + ", unit_price=" + unit_price + ", available_qty="
				+ available_qty + "]";
	}
}
