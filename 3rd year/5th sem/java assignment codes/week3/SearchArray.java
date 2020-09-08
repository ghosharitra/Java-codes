import java.util.*;
class SearchArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int i,n,s,t=0;
System.out.print("enter number of elements: ");
n=scan.nextInt();
int a[]=new int [n];   
System.out.print("enter all the elements: ");
for(i=0;i<n;i++){
a[i]=scan.nextInt();
}
System.out.print("enter a number to search: ");
s=scan.nextInt();

for(i=0;i<n;i++){
if(s==a[i]){
t=1;
break;    
}
}
if(t==0){
    System.out.print("not found");
}else{
    System.out.print(a[i]+" is found");
}

} 
}