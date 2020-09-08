import java.math.BigInteger;
import java.util.*;

class Big{
int n;
BigInteger f;
public Big(int n){
this.n=n;
f=new BigInteger("1");
}

public void factorial(int i){

if(i<=n){
f=f.multiply(BigInteger.valueOf(i));
factorial(i+1);
}

}

}

class Test{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
BigInteger a=new BigInteger(scan.nextLine());
BigInteger b=new BigInteger(scan.nextLine());
BigInteger c=a.add(b);
Big obj=new Big(3);
obj.factorial(1);
System.out.println(obj.f);
}
}