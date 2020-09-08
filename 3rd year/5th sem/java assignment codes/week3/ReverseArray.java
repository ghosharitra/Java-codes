import java.util.*;
class ReverseArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n,t;
System.out.print("enter number of elements: ");
n=scan.nextInt();
int a[]=new int [n];   
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
}

for(int i=0;i<n/2;i++){
t=a[i];
a[i]=a[n-i-1];
a[n-i-1]=t;
}


for(int i=0;i<n;i++){
System.out.print(a[i]+" ");    
}
    
}    
}