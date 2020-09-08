package qeleven;
public class Book extends Product{

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
