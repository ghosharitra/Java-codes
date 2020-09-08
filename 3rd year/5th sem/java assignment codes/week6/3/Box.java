package qthree;

public class Box extends ThreeDObject{

public Box(double length,double breadth,double height){
    super(length,breadth,height);
}
 public void wholeSurfaceArea(){
double r=2*((dim1*dim2) + (dim2*dim3) + (dim3*dim1));
System.out.println("whole surface area of box is "+r);
}
public void volume(){
double r=(dim1*dim2*dim3);
System.out.println("volume of box is "+r);
}
}