import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a anumber: ");
int a=scan.nextInt();
int b=a,x=0;

for(;a>0;){
x=x*10+(a%10);
a=a/10;
}
if(x==b){
System.out.print("Palindrome"); 
}
else{
System.out.print("Not Palindrome"); 
}
}
}