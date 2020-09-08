import java.util.*;
class AlternateArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n;
System.out.print("enter number of elements: ");
n=scan.nextInt();
int a[]=new int [n];   
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
}
for(int i=0;i<n;i=i+2){
System.out.print(a[i]+" ");    
}
}}