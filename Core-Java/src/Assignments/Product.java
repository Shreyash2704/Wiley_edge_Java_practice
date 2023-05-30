package Assignments;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
 
public class Product {
    private String name;
    private int price;
    private String category;
    private double rating;
 
    public Product(String n, int p, String c, double r) {
        this.name = n;
        this.price = p;
        this.category = c;
        this.rating = r;
    }
 
    public String g7etName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public double getRating() {
        return rating;
    }
    public String getData(){
        return "Name: "+this.name+" price: "+this.price+" category: "+this.category+" rating: "+this.rating;
    }
 
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br;
 
        List<Product> List = new ArrayList<>();
 
        try{
            FileReader fr  =new FileReader("C:\\Users\\Sahil\\eclipse-workspace\\Wiley_Java_Course\\data\\product.csv");
            br  = new BufferedReader(fr);
 
            String i;
            while((i= br.readLine())!=null){
                String[] products = i.split("	");
 
                String name  = products[0];
                int price = Integer.parseInt(products[1]);
                String category  = products[2];
                double rating  = Double.parseDouble(products[3]);
                Product product = new Product(name,price,category,rating);
                List.add(product);
        }}
        catch(Exception e){
            e.printStackTrace();
        }
        for (Product product: List) {
            System.out.println(product.getData());
        }
    }
}