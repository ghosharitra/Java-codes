import java.util.Scanner;

class Fourteen{
protected long binary;

public Fourteen(long binary){
this.binary=binary;
}
public void btd()throws Exception{

long a=binary;
while(a>0){
if(!(a%10==0 ||a%10==1)){
throw new WrongNumberFormatException();
}
a=a/10;
}
a=binary;
long n=1,s=0;
while(a>0){
s=((a%10)*n)+s;
a=a/10;
n=n*2;
}

System.out.println("decimal:"+s);
}
}


class WrongNumberFormatException extends Exception{
public String toString(){
return "WrongNumberFormatException";
}}

        


class FourteenTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Fourteen obj=new Fourteen(scan.nextLong());
try{
obj.btd();
}
catch(Exception a){
System.out.println(a);
}
    
}}