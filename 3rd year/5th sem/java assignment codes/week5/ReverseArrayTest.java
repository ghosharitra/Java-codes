import java.util.Scanner;
class ReverseArray{

private int a[], n;

public ReverseArray(int a[],int n){
this.a=a;
this.n=n;
}
public int revArray(){
for(int i=0;i<n/2;i++){
int t=a[i];
a[i]=a[n-i-1];
a[n-i-1]=t;
}
            
return a[0];
}

}


class ReverseArrayTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int i,n;
System.out.print("enter no. of elements: ");
n=scan.nextInt(); 
int a[]=new int[n];
System.out.print("enter the elements: ");
for(i=0;i<n;i++){
a[i]=scan.nextInt();
}
ReverseArray x=new ReverseArray(a,n);
a[0]=x.revArray();
System.out.print("reversed array: ");
for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}
