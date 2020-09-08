import java.util.Scanner;
class Constr{
private int a;
public Constr(int a){
this.a=a;
}
public void getVal(){
System.out.println(a);    
}
}
class ParameterizedConstructor{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int a=scan.nextInt();
Constr c =new Constr(a);
c.getVal();
}
}