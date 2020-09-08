import java.util.Scanner;
class Circle1{

private double radius,area;

public Circle1(double x1,double y1,double x2,double y2){
Point p1=new Point(x1,y1);
Point p2=new Point(x2,y2);
radius=Math.pow(( Math.pow((p2.getX()-p1.getX()),2)-Math.pow((p2.getY()-p1.getY()),2) ),0.5);
}
public double getArea(){
area=(radius*radius*Math.PI);
return area;
}
}

class Point{
private double x,y;    
public Point(double x,double y){
this.x=x;
this.y=y;    
}
public double getX(){
return x;
}
public double getY(){
return y;
}
}
    

class Circle1Test{
public static void main(String args[]){
double x1,y1,x2,y2;
Scanner scan=new Scanner(System.in);
System.out.print("coordinates of first point: ");
x1=scan.nextDouble();
y1=scan.nextDouble();
System.out.print("coordinates of second point: ");
x2=scan.nextDouble();
y2=scan.nextDouble();
Circle1 a=new Circle1(x1,y1,x2,y2);
System.out.println(a.getArea());
}}
