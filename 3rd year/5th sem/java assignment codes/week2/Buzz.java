import java.util.Scanner;

class Number{
int no;

public Number(int no){
this.no=no; 
}
public boolean buzzCheck(){

if(no%7==0 || no%10==7){
    return true;
}
else{
    return false;
}
    
}

}

class Buzz{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a number: ");
Number n= new Number(scan.nextInt());
if(n.buzzCheck())
System.out.println("Buzz Number");
else
System.out.println("Not a Buzz Number");
}
}