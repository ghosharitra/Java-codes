import java.util.Scanner;
class TwoConsecutiveNoSum{

private int no;

public TwoConsecutiveNoSum(int no){
this.no=no;
}
public int dispNumber(){
return no;
}

}
class TwoConsecutiveNoSumTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a,b,n=0,s=0,i;
System.out.print("enter a number with even no. of digits: ");
a=scan.nextInt();
b=a;
while(a>0){
a=a/10;
n++;    
}
n=n-1; 
a=b;
TwoConsecutiveNoSum x[]=new TwoConsecutiveNoSum[n];
for(i=n-1;i>=0;i--){
x[i]=new TwoConsecutiveNoSum(a%100);
a=a/10;
}
    
for(i=0;i<n-1;i++){
s=s+x[i].dispNumber();
System.out.print(x[i].dispNumber()+"+");
}
s=s+x[n-1].dispNumber();
System.out.print(x[n-1].dispNumber()+"="+s);
} }
