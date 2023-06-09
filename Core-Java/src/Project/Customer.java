package Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Customer {
	ArrayList<Product> cart;
	HashMap<String,String> productList;
	// name , id + +price

	Customer(String csvFile){
		cart = new ArrayList<>();
		productList = new HashMap<>();
		String line = "";
		String csvDelimiter = ",";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {
				String[] productData = line.split(csvDelimiter);
				String details = ""+productData[0]+" "+productData[2];
				productList.put(productData[1], details);
				
				
			}
//			System.out.println(productList);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	void viewProducts() {
		
		System.out.println("inside view ");
		System.out.println(productList);
		System.out.format("%-20s  %-20s  %-20s%n","productId","name","price");
		for(Map.Entry<String,String> i: productList.entrySet()) {
			String []sp = i.getValue().split(" ");
			
			System.out.format("%-20s  %-20s  %-20s%n",sp[0],i.getKey(),sp[1]);
		}
		

	}

	boolean searchProduct(String name) {
		return productList.containsKey(name); 
	}

	void addToCart(String name) {
		String productdetails = productList.get(name);
		String []sp =  productdetails.split(" ");  // id +$+price
		int id = Integer.valueOf(sp[0]);
		double price = Double.valueOf(sp[1]);
		Product obj = new Product(id,name,price);
		if(checkContains(obj)!=-1) {
			int oldCount = cart.get(checkContains(obj)).getCount();
			cart.remove(checkContains(obj));
			obj.setCount(oldCount+1);	
			cart.add(obj);
		}
		else {
			obj.setCount(obj.getCount()+1);	
			cart.add(obj);			
		}
		
		System.out.println("Added to Cart");
	}


	boolean removeProduct(String name){
		String productdetails = productList.get(name);
		String []sp =  productdetails.split(" ");  // id +$+price
		int id = Integer.valueOf(sp[0]);
		double price = Double.valueOf(sp[1]);
		Product obj = new Product(id,name,price); 

		if(checkContains(obj)!=-1){
			if(obj.getCount()>1) {
				obj.setCount(obj.getCount()-1);
			}
			else {
				cart.remove(checkContains(obj));
			}
			System.out.println("Product removed from cart!");
			return true;
		}
		return false;     
	}

	
	
	int checkContains(Product obj) {
		for(int i=0;i<cart.size();i++) {
			if(obj.getName() == cart.get(i).getName())
				return i;
		}
		return -1;
	}
	

	void viewCart() {
		System.out.println("All Cart Items:");
		System.out.println("********************************************");
		System.out.format("%-20s  %-20s  %-20s  %-20s%-20s%n","S.no","productId","name","price","Quantity");

		for(int i=0;i<cart.size();i++) {
			Product curr=cart.get(i);
			System.out.format("%-20s  %-20s  %-20s  %-20s %-20s%n",""+(i+1),""+curr.getId(),""+curr.getName(),""+curr.getPrice(),""+curr.getCount());

		}
	}

	ArrayList<Product> pay() {
		System.out.println("Call function of payment class and pass arrayList");
		
		return cart;
	}

	public static void main(String[] args) {
		Customer obj = new Customer("C:\\Users\\Sahil\\eclipse-workspace\\Wiley_Java_Course\\data\\data.csv");
		obj.viewProducts();
		
		obj.addToCart("Product1");
		obj.addToCart("Product2");
		//obj.addToCart("Suitcase");

		obj.viewCart();
		obj.removeProduct("Product2");
		obj.viewCart();

		
		//		System.out.println(obj.searchProduct("Suitcase"));
//
	}

}
