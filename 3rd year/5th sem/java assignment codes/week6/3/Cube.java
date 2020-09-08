package qthree;

public class Cube extends ThreeDObject{

public Cube(double side){
    super(side,side,side);
}
 public void wholeSurfaceArea(){
double r=6*(dim1*dim1);
System.out.println("whole surface area of cube is "+r);
}
public void volume(){
double r=(dim1*dim2*dim3);
System.out.println("volume of cube is "+r);
}
}