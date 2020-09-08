import java.util.Scanner;
class ReverseNo{

private int num;

public ReverseNo(int num){
this.num=num;
}
public int revNo(){
int b=0;
while(num>0){
b=10*b+(num%10);
num=num/10;
}    
return b;
}
}

class ReverseNoTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a;
System.out.print("enter a number: ");
a=scan.nextInt(); 
ReverseNo x=new ReverseNo(a);
System.out.print("reversed number: "+x.revNo());
}
}