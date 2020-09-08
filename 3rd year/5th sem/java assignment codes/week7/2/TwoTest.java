import java.util.Scanner;


class Two{

protected int a[]=new int[5];

public Two(int a[]){
this.a=a;
}
public int search(int i){
try{
if(i<0){
throw new NegativeArrayIndexException();    
}else{
System.out.println("value: "+a[i]);    
}              
}catch(NegativeArrayIndexException obj){
System.out.println(obj);
}
System.out.println("END OF LINE");
return a[i];
}
public void divide(int a,int b){
try{
double c=a/b;
System.out.println(a+"/"+b+"="+c);
}catch(ArithmeticException obj){
System.out.println(obj);    
}
}
}

class NegativeArrayIndexException extends Exception{

public String toString(){
return "NegativeArrayIndexException";
}

    
}

class TwoTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int i;
int a[]=new int[5];
for(i=0;i<5;i++)    
a[i]=scan.nextInt();
Two t=new Two(a);
System.out.println("enter an index to search the array: ");
int x=t.search(scan.nextInt());
System.out.println("enter a no. to divide the searched no: ");
t.divide(x, scan.nextInt());



}}