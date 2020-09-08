import java.util.Scanner;

class Median{

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
System.out.print("enter no. of numbers: ");
int n=scan.nextInt();
float a[]=new float[n];
int i;
float m;
System.out.print("enter "+n+" numbers:\n");
for(i=0;i<n;i++){
a[i]=scan.nextInt();
}
if(n%2==0){
m=(a[n/2-1]+a[n/2])/2;
}else{
m=a[n/2];
}
System.out.print("median: "+m);
}
}