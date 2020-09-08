import java.util.Scanner;
class Vehicle1{

private int wheels,speed;

public Vehicle1(int wheels,int speed){
this.wheels=wheels;
this.speed=speed;
}

public void showData(){
System.out.println("no. of wheels: "+wheels);
System.out.println("speed: "+speed+" m/s");
}

public int getSpeed(){
return speed;
}

}

class Car1 extends Vehicle1{

private int passenger;

public Car1(int wheels,int speed,int passenger){
super(wheels,speed);
this.passenger=passenger;
}

public void showData(){
super.showData();
System.out.println("no. of passenger: "+passenger);
}
}


class truck1 extends Vehicle1{

private double loadLimit;
    
public truck1(int wheels,int speed,double loadLimit){
super(wheels,speed);
this.loadLimit=loadLimit;
}

public void showData(){
super.showData();
System.out.println("load limit: "+loadLimit+" tonnes");
}
}


class Vehicle1Test{

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a,b,c;
double d;

System.out.println("enter no. of wheels, speed(in m/s) and no. of passenger of a car: ");

a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();

Car1 m=new Car1(a,b,c);
m.showData();

System.out.println("enter no. of wheels, speed(in m/s) and load limit(in tonnes) of a truck: ");

a=scan.nextInt();
b=scan.nextInt();
d=scan.nextDouble();

truck1 n=new truck1(a,b,d);
n.showData();

if(m.getSpeed()>n.getSpeed()){
System.out.println("the car is faster than the truck");
}else if(m.getSpeed()<n.getSpeed()){
System.out.println("the truck is faster than the car");
}else{
System.out.println("speed of the car and the truck is same");    
}
}
}