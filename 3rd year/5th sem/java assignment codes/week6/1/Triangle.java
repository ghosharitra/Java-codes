package qone;

public class Triangle extends Shape{


public Triangle(int b,int h){
super(b,h);    
}
public void perimeter(){
System.out.println("perimeter: "+(dim1+dim2+dim2));    
}
public void area(){
System.out.println("area: "+(0.5*dim1*dim2));    
}
}