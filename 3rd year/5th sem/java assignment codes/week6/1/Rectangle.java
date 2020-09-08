package qone;

public class Rectangle extends Shape{


public Rectangle(int l,int b){
super(l,b);    
}
public void perimeter(){
System.out.println("perimeter: "+(2*(dim1+dim2)));    
}
public void area(){
System.out.println("area: "+(dim1*dim2));    
}
}