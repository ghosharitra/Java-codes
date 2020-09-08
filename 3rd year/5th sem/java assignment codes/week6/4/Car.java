package qfour;

public class Car extends Vehicle{
private String manufactureName;


public Car(int regnNumber,int speed,String color,String ownerName,String manufactureName){
super(regnNumber,speed,color,ownerName);
this.manufactureName=manufactureName;
}

public void showData(){
super.showData();

System.out.println("Registration Number: "+regnNumber);
System.out.println("speed: "+speed);
System.out.println("color: "+color);
System.out.println("Owner Name: "+ownerName);
System.out.println("Manufacture Name: "+manufactureName);
}
}
