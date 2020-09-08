package qeleven;

public class TravelGuide extends Book{

protected String country;

public TravelGuide(int productId,String name,String description,double price,String isbn,String author,String title,String country){
super(productId, name, description, price, isbn, author, title);
this.country=country;
}
        
public void display(){
super.display();
System.out.println("travel guide-country:"+ country); 
}
    
}
