import java.util.*;
class CountNonZeroArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n,c=0;
System.out.print("enter number of elements: ");
n=scan.nextInt();
int a[]=new int [n];   
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
if(a[i]!=0)
c++;
}
System.out.print("number of non-zero elements is "+c);

}
    
}