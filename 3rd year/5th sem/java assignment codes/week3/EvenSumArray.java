import java.util.*;
class EvenSumArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n,s=0;
System.out.print("enter number of elements: ");
n=scan.nextInt();
int a[]=new int [n];   
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
if(a[i]%2==0)
s=s+a[i];
}
System.out.print("sum of even number is "+s);

}
    
}