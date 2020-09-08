
abstract class MotorVehicle{
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

class Car extends MotorVehicle{
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


class MotorVehicleTest{
public static void main(String args[]){
MotorVehicle m=new Car("abc",123,150000,5);
m.display();
m.discount();
}
}