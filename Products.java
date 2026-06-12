public class Products{
	int productId;
	String productName;
	double price;
	String category;
	
	Products(int productId, String productName, double price, String category){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	public String toString(){
		return "product Id: " + productId + "\nproduct Name: "+ productName + "\nprice: "+ price + "\nproduct category: " + category;
		
	}
	
	public boolean equals(Object obj){
		Products product = (Products)obj;
		if(product.productId == this.productId && product.productName.equals(this.productName) && product.price == this.price && product.category.equals(this.category)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	public static void main(String [] args){
		Products product1 = new Products(201, "AsusF19", 71999, "Electronics");
		Products product2 = new Products(201, "AsusF19", 71999, "Electronics");
		System.out.println(product1);
		System.out.println(product1.equals(product2));
	
	}



}