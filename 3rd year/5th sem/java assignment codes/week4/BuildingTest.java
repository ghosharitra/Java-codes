import java.util.Scanner;

class Building{
private int floors,rooms;
private double footage;

public Building(int floors,int rooms,double footage){
this.floors=floors;
this.rooms=rooms;
this.footage=footage;
}

public void print(){
System.out.println("no. of floors: "+floors);    
System.out.println("no. of rooms: "+rooms);
System.out.println("footage: "+footage);
}

}

class House extends Building{
private int bedrooms,bathrooms;

public House(int floors,int rooms,double footage,int bedrooms,int bathrooms){
super(floors, rooms, footage);
this.bedrooms=bedrooms;
this.bathrooms=bathrooms;

}

public void print(){
super.print();
System.out.println("no. of bedrooms: "+bedrooms);    
System.out.println("no. of bathrooms: "+bathrooms);
}   

}

class BuildingTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a,b,c,d;
double e;
System.out.println("enter no. of floors,no. of rooms, total footage, no. of bedrooms and no. of bathrooms:" );
a=scan.nextInt();
b=scan.nextInt();
e=scan.nextDouble();
c=scan.nextInt();
d=scan.nextInt();
House h=new House(a, b, e, c, d);
h.print();
}
    
}