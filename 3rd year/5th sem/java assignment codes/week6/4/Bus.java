package qfour;

public class Bus extends Vehicle{
private String routeNumber;


public Bus(int regnNumber,int speed,String color,String ownerName,String routeNumber){
super(regnNumber,speed,color,ownerName);
this.routeNumber=routeNumber;
}

public void showData(){
super.showData();
System.out.println("Registration Number: "+regnNumber);
System.out.println("speed: "+speed);
System.out.println("color: "+color);
System.out.println("Owner Name: "+ownerName);
System.out.println("route number:"+routeNumber);
}
}
