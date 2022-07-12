package AmazonImplementation;

public class Search {
	
	public String ProductDisplay(Product prodct) {
		
		if(prodct.ProductList().contains(prodct.getProductName())) {
		return prodct.getProductName();
		}
		return null;
		
		
		
		
	}

}
