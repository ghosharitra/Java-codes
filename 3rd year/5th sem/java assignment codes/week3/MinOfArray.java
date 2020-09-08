import java.util.Scanner;

class MinOfArray{
 public static void main(String args[]){
   
int min,i,n;
Scanner scan = new Scanner(System.in);
System.out.print("enter no. of elements: ");
n=scan.nextInt();
int a[]=new int [n];
System.out.print("enter all elements: ");
for(i=0;i<n;i++)
a[i]=scan.nextInt();
min=a[0];    
for(i=0;i<n;i++){ 
if(min>a[i])
min=a[i];    
}       
System.out.println("smallest element is "+min);
}   
}