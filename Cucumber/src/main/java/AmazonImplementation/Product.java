package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String ProductName;
	private int Price;
	
	
	public Product(String ProductName, int price) {
		this.ProductName = ProductName;
		this.Price = price;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int Price) {
		this.Price = Price;
	}
	
	
		
	public List<String> ProductList(){
		
		List<String> Lists = new ArrayList<String>();
		
		Lists.add("Chetan Bhagat");
		Lists.add("Ravinder Singh");
		Lists.add("Amish");
		Lists.add(ProductName);
		
		return Lists;
		
	}
		
		
		
		
		
		

	
	
	
	
	

}
