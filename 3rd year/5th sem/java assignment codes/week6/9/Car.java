package qnine;

public class Car extends MotorVehicle{
protected double discountRate;

public Car(String modelName,int modelNumber,double modelPrice,double discountRate){
super(modelName, modelNumber, modelPrice);
this.discountRate=discountRate;
}
public void display(){
super.display();
System.out.println("discount rate:"+ discountRate);
}

public void discount(){
System.out.println("discount:"+ modelPrice*discountRate/100);    
}

}
