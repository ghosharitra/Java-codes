import java.util.Scanner;
class Five{
protected long x;

public Five(long x){
this.x=x;
}
public void factCal()throws Exception{
if(x<0){
System.out.println("Value of x must be positive");
throw new IllegalArgumentException(); 
}
else if(x>20){
System.out.println("Result will overflow");
throw new IllegalArgumentException();     
}
else{
long s=1;
for(long i=1;i<x;i++){
s=s*i;
}
System.out.println(x+"! = "+s);
}

}
}

class IllegalArgumentException extends Exception{

public String toString(){
return "IllegalArgumentException";
}


}

class FiveTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Five f=new Five(scan.nextLong());
try{
f.factCal();
}
catch(Exception a){
System.out.println(a);
}
}
}