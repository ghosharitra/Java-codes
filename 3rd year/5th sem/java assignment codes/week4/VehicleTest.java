import java.util.Scanner;
class Vehicle{
protected int regnNumber,speed;
protected String color,ownerName;

public Vehicle(int regnNumber,int speed,String color,String ownerName){
this.regnNumber=regnNumber;
this.speed=speed;
this.color=color;
this.ownerName=ownerName;
}

public void showData(){
System.out.println("Registration Number: "+regnNumber);
System.out.println("speed: "+speed);
System.out.println("color: "+color);
System.out.println("Owner Name: "+ownerName);
}
}

class Car extends Vehicle{
private String manufactureName;


public Car(int regnNumber,int speed,String color,String ownerName,String manufactureName){
super(regnNumber,speed,color,ownerName);
this.manufactureName=manufactureName;
}

public void showData(){
super.showData();
System.out.println("Manufacture Name: "+manufactureName);
}
}



class Bus extends Vehicle{
private String routeNumber;


public Bus(int regnNumber,int speed,String color,String ownerName,String routeNumber){
super(regnNumber,speed,color,ownerName);
this.routeNumber=routeNumber;
}

public void showData(){
super.showData();
System.out.println("route number:"+routeNumber);
}
}

class VehicleTest{

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int m,n;
String o,p,q;

System.out.println("enter registration number, speed, color, ownerName, manufacture name of a car: ");

m=scan.nextInt();
n=scan.nextInt();
scan.nextLine();
o=scan.nextLine();
p=scan.nextLine();
q=scan.nextLine();

Car c=new Car(m,n,o,p,q);
c.showData();

System.out.println("enter registration number, speed, color, ownerName, route number of a bus:");


m=scan.nextInt();
n=scan.nextInt();
scan.nextLine();
o=scan.nextLine();
p=scan.nextLine();
q=scan.nextLine();

Bus b=new Bus(m,n,o,p,q);
b.showData();
}



}
