import java.util.Scanner;

class CountPrimeArray{
 public static void main(String args[]){
   
int i,j,n,t,c=0;
Scanner scan = new Scanner(System.in);
System.out.print("enter no. of elements: ");
n=scan.nextInt();
int a[]=new int [n];
System.out.print("enter all elements: ");
for(i=0;i<n;i++)
a[i]=scan.nextInt();

for(j=0;j<n;j++){ 
    t=0;
    for(i=2;i<=a[j]/2;i++){
    if(a[j]%i==0){ 
    t=1;
    break;    
    }
    }
    if(t==0){
        c++;  
    }
}       
System.out.println("number of prime no. is "+c);
}   
}