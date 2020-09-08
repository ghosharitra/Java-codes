import java.util.Scanner;

class Distance{
protected double distml;

public Distance(double distml){
this.distml=distml;
}

public void travelTime(){
double time=distml/60;
System.out.println("time taken(in hours) when the speed is 60 miles per hour: "+time);
}
}

class DistanceMKS extends Distance{
private double distkm;
public DistanceMKS(double distml){
super(distml);
distkm=1.60934*distml;
}

public void travelTime(){
super.travelTime();
double time=distkm/100;
System.out.println("time taken(in seconds) when the speed is 100 km/s: "+time);       
}   
}

class DistanceTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
double n;
System.out.print("enter distance in miles: ");
n=scan.nextDouble();
DistanceMKS d=new DistanceMKS(n);
d.travelTime();
}
}