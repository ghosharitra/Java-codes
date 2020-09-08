package qtwelve;

public class FourWheeler extends Vehicle{

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
