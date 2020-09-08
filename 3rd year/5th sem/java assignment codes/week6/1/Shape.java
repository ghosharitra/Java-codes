package qone;

abstract public class Shape{

protected int dim1,dim2;

public Shape(int dim1,int dim2){
this.dim1=dim1;
this.dim2=dim2;    
}
abstract public void perimeter();
abstract public void area();
}