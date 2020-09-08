package qtwelve;
abstract public class Vehicle{

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
