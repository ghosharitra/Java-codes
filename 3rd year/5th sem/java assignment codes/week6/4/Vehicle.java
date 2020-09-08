package qfour;
public class Vehicle{
protected int regnNumber,speed;
protected String color,ownerName;

public Vehicle(int regnNumber,int speed,String color,String ownerName){
this.regnNumber=regnNumber;
this.speed=speed;
this.color=color;
this.ownerName=ownerName;
}

public void showData(){
System.out.println("This is vehicle class");
}
}