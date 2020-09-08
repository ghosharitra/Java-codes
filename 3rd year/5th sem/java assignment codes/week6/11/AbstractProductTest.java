abstract class AbstractProduct{

protected int productId;
protected String name;
protected String description;

public AbstractProduct(int productId,String name,String description){
this.productId=productId;
this.name=name;
this.description=description;
}

abstract public void display();

}

class Product extends AbstractProduct{

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

class Book extends Product{

protected String isbn;
protected String author;
protected String title;

public Book(int productId,String name,String description,double price,String isbn,String author,String title){
super(productId, name, description,price);
this.isbn=isbn;
this.author=author;
this.title=title;
}
        
public void display(){
super.display();    
System.out.println("book isbn:"+ isbn);  
System.out.println("book author:"+ author);
System.out.println("book title:"+ title);
}
    
}

class CompactDisc extends Product{

protected String artist;
protected String title;
    
public CompactDisc(int productId,String name,String description,double price,String artist,String title){
super(productId, name, description,price);
this.artist=artist;
this.title=title;
}
        
public void display(){
super.display(); 
System.out.println("compact disc artist:"+ artist);  
System.out.println("compact disc title:"+ title);
}
    
}

class TravelGuide extends Book{

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


class AbstractProductTest{
public static void main(String args[]){
AbstractProduct a=new TravelGuide(123, "abc", "xyz", 5000, "pqr", "def", "mno", "india");
a.display();
a=new CompactDisc(345, "qwe", "rty", 450,"uio", "asd");
a.display();
}
}