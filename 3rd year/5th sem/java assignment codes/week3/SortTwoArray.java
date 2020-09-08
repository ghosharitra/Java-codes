import java.util.*;
class SortTwoArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int m,n,i,j,k;
System.out.print("enter number of elements in first array: ");
m=scan.nextInt();
System.out.print("enter number of elements in second array: ");
n=scan.nextInt();
int a[]=new int [m];
int b[]=new int [n];
int c[]=new int [m+n];   
System.out.print("enter all the elements of first array: ");
for(i=0;i<m;i++){
a[i]=scan.nextInt();
}
System.out.print("enter all the elements of second array: ");
for(i=0;i<n;i++){
b[i]=scan.nextInt();
}
i=0;
j=0;
for(k=0;k<m+n;k++){
if(i<m && j<n){    
if(a[i]<=b[j]){    
c[k]=a[i];
i++;
}else{    
c[k]=b[j];
j++;    
}    
}
else if(i<m && j>=n){   
c[k]=a[i];
i++;
}
else if(j<n && i>=m){
c[k]=b[j];
j++; 
}
System.out.print(c[k]+" ");    
}}}