import java.util.Scanner;

class Num1{
protected int n;

public Num1(int n){
this.n=n;
}

public void showNum(){
System.out.println("integer number: "+n);    
}
}

class Oct1Num extends Num1{
int o=0;

public Oct1Num(int n){
super(n);
}

public void showNum(){
int no=n,o1=0;

while(no>0){
o1=o1*10+(no%8);
no=no/8;
}

while(o1>0){
o=o*10+(o1%10);
o1=o1/10;
}
System.out.println("octal number: "+o);    
}   
}

class Num1Test{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int n;
System.out.print("enter a integer no: ");
n=scan.nextInt();
Oct1Num o=new Oct1Num(n);
o.showNum();
}
}