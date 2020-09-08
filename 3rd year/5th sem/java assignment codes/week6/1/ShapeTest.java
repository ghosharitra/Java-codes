import qone.*;

public class ShapeTest{
public static void main(String args[]){
Shape s=null;
s=new Rectangle(5,7);
s.perimeter();    
s.area();
s=new Triangle(2,7);
s.perimeter();    
s.area();
}}