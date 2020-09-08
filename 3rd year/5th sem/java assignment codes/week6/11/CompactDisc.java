package qeleven;

public class CompactDisc extends Product{

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
