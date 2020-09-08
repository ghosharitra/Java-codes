package qeleven;

public class Product extends AbstractProduct{

protected double price;

public Product(int productId,String name,String description,double price){
super(productId, name, description);
this.price=price;
}
    
public void display(){
System.out.println("product id:"+ productId);  
System.out.println("product name:"+ name);
System.out.println("product description:"+ description);
System.out.println("product price:"+ price);
}

}
