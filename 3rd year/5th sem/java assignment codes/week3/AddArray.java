import java.util.*;
class AddArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n;
System.out.print("enter number of elements: ");
n=scan.nextInt();
int a[]=new int [n];
int b[]=new int [n];
int c[]=new int [n];
System.out.print("enter all the elements in first array: ");
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
}
System.out.print("enter all the elements in second array: ");
for(int i=0;i<n;i++){
b[i]=scan.nextInt();
}
for(int i=0;i<n;i++){
c[i]=a[i]+b[i];
System.out.print(c[i]+" ");
}
}}