import java.util.*;
class SumAverageArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n,s=0,avg;
System.out.print("enter number of elements: ");
n=scan.nextInt();
int a[]=new int [n];   
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
s=s+a[i];
}
avg=s/n;
System.out.print("sum is "+s+" and average is "+avg);

}
    
}