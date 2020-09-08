package qthree;

public class Cone extends ThreeDObject{

public Cone(double radius,double height){
super(radius,radius,height);
}
public void wholeSurfaceArea(){
double l=Math.pow( (Math.pow(dim1,2)+Math.pow(dim3,2) ) ,0.5);

double r=Math.PI*dim1*(dim1+l);
System.out.println("whole surface area of cone is "+r);
}
public void volume(){
double r=(Math.PI*dim1*dim1*dim3)/3;
System.out.println("volume of cone is "+r);
}
}