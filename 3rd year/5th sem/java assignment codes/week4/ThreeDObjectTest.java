import java.util.Scanner;
abstract class ThreeDObject{
protected double dim1,dim2,dim3;

public ThreeDObject(double dim1,double dim2,double dim3){
this.dim1=dim1;
this.dim2=dim2;
this.dim3=dim3;
}

public abstract void wholeSurfaceArea();
public abstract void volume();
}



class Box extends ThreeDObject{

public Box(double length,double breadth,double height){
super(length,breadth,height);
}

public void wholeSurfaceArea(){
double r=2*((dim1*dim2)+(dim2*dim3)+(dim3*dim1));
System.out.println(r);
}
public void volume(){
double r=dim1*dim2*dim3;
System.out.println(r);
}

}




class Cube extends ThreeDObject{

public Cube(double length){
super(length,length,length);
}

public void wholeSurfaceArea(){
    double r=6*(dim1*dim1);
    System.out.println(r);
}
public void volume(){
    double r=dim1*dim1*dim1;
    System.out.println(r);
}

}



class Cylinder extends ThreeDObject{

public Cylinder(double height,double radius){
super(height,radius,radius);
}

public void wholeSurfaceArea(){
    double r=2*Math.PI*dim2*dim1;
    System.out.println(r);
}
public void volume(){
    double r=Math.PI*dim2*dim2*dim1;
    System.out.println(r);
}

}



class Cone extends ThreeDObject{

public Cone(double height,double radius){
super(height,radius,radius);
}

public void wholeSurfaceArea(){
double l;
l=Math.pow(dim1,2)+Math.pow(dim2,2);
l=Math.pow(l,0.5);
double r=Math.PI*((dim2*dim2)+(l*dim2));
System.out.println(r);
}
public void volume(){
    double r=(Math.PI*dim2*dim2*dim1)/3;
    System.out.println(r);
}

}




class ThreeDObjectTest{

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
double a,b,c;

System.out.println("enter length,breadth and height for box");

a=scan.nextDouble();
b=scan.nextDouble();
c=scan.nextDouble();
Box m=new Box(a,b,c);
m.wholeSurfaceArea();
m.volume();


System.out.println("enter length for cube");

a=scan.nextDouble();
Cube n=new Cube(a);
n.wholeSurfaceArea();
n.volume();


System.out.println("enter height and radius for cylinder");

a=scan.nextDouble();
b=scan.nextDouble();
Cylinder o=new Cylinder(a,b);
o.wholeSurfaceArea();
o.volume();


System.out.println("enter height and radius for cone");

a=scan.nextInt();
b=scan.nextInt();
Cone p=new Cone(a,b);
p.wholeSurfaceArea();
p.volume();

}
}
