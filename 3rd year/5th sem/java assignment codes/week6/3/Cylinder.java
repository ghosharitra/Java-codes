package qthree;

public class Cylinder extends ThreeDObject{

public Cylinder(double radius,double height){
    super(radius,radius,height);
}
 public void wholeSurfaceArea(){
double r=2*Math.PI*dim3;
System.out.println("whole surface area of cylinder is "+r);
}
public void volume(){
double r=Math.PI*dim1*dim1*dim3;
System.out.println("volume of cylinder is "+r);
}
}