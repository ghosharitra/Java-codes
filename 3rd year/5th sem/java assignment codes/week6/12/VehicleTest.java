abstract class Vehicle{

protected int id;
protected String name;
protected String licenceNumber;

public Vehicle(int id,String name,String licenceNumber){
this.id=id;
this.name=name;
this.licenceNumber=licenceNumber;
}

abstract public void display();
}

class TwoWheeler extends Vehicle{

protected String steeringHandle;

public TwoWheeler(int id,String name,String licenceNumber,String steeringHandle){
super(id, name, licenceNumber);
this.steeringHandle=steeringHandle;
} 
public void display(){
System.out.println("id:"+ id);
System.out.println("name:"+ name);
System.out.println("licenceNumber:"+ licenceNumber);
System.out.println("steeringHandle:"+ steeringHandle);
}

}

class FourWheeler extends Vehicle{

protected String steeringWheel;

public FourWheeler(int id,String name,String licenceNumber,String steeringWheel){
super(id, name, licenceNumber);
this.steeringWheel=steeringWheel;
} 


public void display(){
System.out.println("id:"+ id);
System.out.println("name:"+ name);
System.out.println("licenceNumber:"+ licenceNumber);
System.out.println("steeringWheel:"+ steeringWheel);
}

}

class VehicleTest{
public static void main(String args[]){

Vehicle v=new TwoWheeler(7, "abc", "wb7451", "xyz");
v.display();
v=new FourWheeler(2, "pqr", "mh1254", "mno");
v.display();
}
}