package qthree;

abstract public class ThreeDObject{

protected double dim1,dim2,dim3;

public ThreeDObject(double dim1,double dim2,double dim3){
    this.dim1=dim1;
    this.dim2=dim2;
    this.dim3=dim3;
}
abstract public void wholeSurfaceArea();
abstract public void volume();

}