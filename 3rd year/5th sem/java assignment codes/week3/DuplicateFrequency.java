import java.util.Scanner;

class DuplicateFrequency{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int i,j,m=0,n,t=0,c;
System.out.print("enter no. of elements: ");
n=scan.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.print("enter all elements: ");
for(i=0;i<n;i++){
a[i]=scan.nextInt();
}	
               
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
if(a[i]==a[j]){
t=1;
}}        
if(t==0){
b[m]=a[i];
m++;
}
else{
t=0;
}}

for(i=0;i<m;i++){
c=0;
for(j=0;j<n;j++){
if(b[i]==a[j])
c++;
}
if(c!=1)
System.out.println(b[i]+" is a duplicate, its frequency is "+c);
}

}}
