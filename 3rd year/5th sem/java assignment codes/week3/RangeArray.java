import java.util.*;
class RangeArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n,l,u;
System.out.print("enter number of elements: ");
n=scan.nextInt();
int a[]=new int [n];   
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
}
l=a[0];
u=a[0];
for(int i=0;i<n;i++){
if(l>a[i])
l=a[i];
if(u<a[i])
u=a[i];
}
System.out.print("range is "+l+" to "+u);

}
}