package qnine;

abstract public class MotorVehicle{
protected String modelName;
protected int modelNumber;
protected double modelPrice;

public MotorVehicle(String modelName,int modelNumber,double modelPrice){
this.modelName=modelName;
this.modelNumber=modelNumber;
this.modelPrice=modelPrice;
}
public void display(){
System.out.println("model name:"+ modelName);    
System.out.println("model Number:"+ modelNumber);
System.out.println("model price:"+ modelPrice);
}
    
abstract public void discount();
}
