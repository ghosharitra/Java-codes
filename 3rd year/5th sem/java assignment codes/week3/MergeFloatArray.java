import java.util.*;
class MergeFloatArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int m,n;
System.out.print("enter number of elements in first array: ");
m=scan.nextInt();
float a[]=new float [m];   
System.out.print("enter all the elements: ");
for(int i=0;i<m;i++){
a[i]=scan.nextFloat();
}

System.out.print("enter number of elements in second array: ");
n=scan.nextInt();
float b[]=new float [n];   
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++){
b[i]=scan.nextFloat();
}

float c[]=new float [m+n];
for(int i=0;i<m+n;i++){
if(i<m)
c[i]=a[i];
else
c[i]=b[i-m];

System.out.print(c[i]+" ");
}
    
}}