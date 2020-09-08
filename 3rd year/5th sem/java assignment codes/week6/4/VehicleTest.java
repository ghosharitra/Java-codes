import qfour.*;
import java.util.Scanner;

public class VehicleTest{

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Vehicle v=null;
int m,n;
String o,p,q;

System.out.println("enter registration number, speed, color, ownerName, manufacture name of a car: ");

m=scan.nextInt();
n=scan.nextInt();
scan.nextLine();
o=scan.nextLine();
p=scan.nextLine();
q=scan.nextLine();

v=new Car(m,n,o,p,q);
v.showData();

System.out.println("enter registration number, speed, color, ownerName, route number of a bus:");


m=scan.nextInt();
n=scan.nextInt();
scan.nextLine();
o=scan.nextLine();
p=scan.nextLine();
q=scan.nextLine();

v=new Bus(m,n,o,p,q);
v.showData();
}



}
