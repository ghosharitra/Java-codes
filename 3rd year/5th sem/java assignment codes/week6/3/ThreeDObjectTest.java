import qthree.*;
import java.util.Scanner;

public class ThreeDObjectTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
double dim1,dim2,dim3;
System.out.println("enter 3 numbers: ");
dim1=scan.nextInt();
dim2=scan.nextInt();
dim3=scan.nextInt();

ThreeDObject t=null; 
t=new Box(dim1,dim2,dim3);
t.wholeSurfaceArea();
t.volume();

t= new Cube(dim1);
t.wholeSurfaceArea();
t.volume();

t= new Cylinder(dim1,dim2);
t.wholeSurfaceArea();
t.volume();


t= new Cone(dim1,dim2);
t.wholeSurfaceArea();
t.volume();

}}