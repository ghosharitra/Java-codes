import java.util.Scanner;


class One{

protected int a;

public One(int a){
this.a=a;
}
public void check(int b)throws Exception{

if(b<0){
throw new NegativeNoDivideException();
}
else{
double c=a/b;
System.out.println(a+"/"+b+"="+c);
}
}
}

class NegativeNoDivideException extends Exception{

public String toString(){
return "NegativeNoDivideException";
}

    
}

class OneTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);

System.out.print("enter a no: ");
int a=scan.nextInt();
One o=new One(a);
System.out.print("enter a no. to divide the previous no: ");
try{
o.check(scan.nextInt());
}
catch(Exception obj){
System.out.println(obj);
}
finally{
System.out.println("END OF THE PROGRAM");
}

}}