import java.util.Scanner;

class Building1{
private int floors,rooms;
private double footage;

public Building1(int floors,int rooms,double footage){
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

class House1 extends Building1{
private int bedrooms,bathrooms;

public House1(int floors,int rooms,double footage,int bedrooms,int bathrooms){
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


class Office1 extends Building1{
private int telephones,tables;
    
public Office1(int floors,int rooms,double footage,int telephones,int tables){
super(floors, rooms, footage);
this.telephones=telephones;
this.tables=tables;
}
    
public void print(){
super.print();
System.out.println("no. of telephones: "+telephones);    
System.out.println("no. of tables: "+tables);
}   
}



class Building1Test{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a,b,c,d;
double e;
System.out.println("enter no. of floors,no. of rooms, total footage, no. of bedrooms and no. of bathrooms in a house:" );
a=scan.nextInt();
b=scan.nextInt();
e=scan.nextDouble();
c=scan.nextInt();
d=scan.nextInt();
House1 h=new House1(a, b, e, c, d);
h.print();

System.out.println("enter no. of floors,no. of rooms, total footage, no. of telephones and no. of tables in a office:" );
a=scan.nextInt();
b=scan.nextInt();
e=scan.nextDouble();
c=scan.nextInt();
d=scan.nextInt();
Office1 o=new Office1(a, b, e, c, d);
o.print();


}}