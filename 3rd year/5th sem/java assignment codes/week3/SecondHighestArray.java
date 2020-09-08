import java.util.*;
class SecondHighestArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n,h,sh;
System.out.print("enter number of elements: ");
n=scan.nextInt();
int a[]=new int [n];   
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
}
h=a[0];
sh=a[0];
for(int i=0;i<n;i++){
if(h<a[i])
h=a[i];
if(a[i]<h)
sh=a[i];
}
for(int i=0;i<n;i++){
if(sh<a[i] && a[i]<h)
sh=a[i];
}
System.out.print("second highest number is "+sh);

}
    
}