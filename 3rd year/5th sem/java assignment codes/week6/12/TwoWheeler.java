package qtwelve;
public class TwoWheeler extends Vehicle{

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
