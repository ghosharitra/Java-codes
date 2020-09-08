import java.util.Scanner;
class Circle{

private double radius;
private String colour;

public Circle(){

radius=1.0;
colour="red";
}

public Circle(double radius){
this.radius=radius;
colour="red";
}

public double getRadius(){
return radius;
}
public double getArea(){
double area=(radius*radius*Math.PI);
return area;
}

public String getColour(){
return colour;
}


}

class CircleTest{


public static void main(String args[]){

Scanner scan=new Scanner(System.in);
double x=scan.nextDouble();
Circle a=new Circle();
Circle b=new Circle(x);
System.out.println(a.getRadius());
System.out.println(a.getArea());
System.out.println(a.getColour());
System.out.println(b.getRadius());
System.out.println(b.getArea());
System.out.println(b.getColour());
}

}
