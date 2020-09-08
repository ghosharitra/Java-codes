import java.util.Scanner;
class Overload{
private int a;
private float b;
private String c;
public Overload(int a,float b,String c){
this.a=a;
this.b=b;
this.c=c;    
}
public void setData(int a){
this.a=a;    
}
public void setData(float b){
this.b=b;    
}
public void setData(String c){
this.c=c;    
}
public void print(){
System.out.println(a+" "+b+" "+c);     
}
    

}


class OverloadTest{

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("enter integer no.: ");
int a=scan.nextInt();
System.out.print("enter float no.: ");
float b=scan.nextFloat();
System.out.print("enter String: ");    
scan.nextLine();
String c=new String(scan.nextLine());
Overload o=new Overload(a,b,c);
o.print();
System.out.print("enter integer no.: ");
a=scan.nextInt();
o.setData(a);
o.print();

System.out.print("enter float no.: ");
b=scan.nextFloat();
o.setData(b);
o.print();

System.out.print("enter String: ");    
scan.nextLine();
c=scan.nextLine();
o.setData(c);
o.print();
}
}
