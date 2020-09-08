import java.util.Scanner;
class ArmstrongNo{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a number: ");
int a=scan.nextInt();

int s=0,i=0,b,c,n,x=a;	
while(a>0){
a=a/10;
i++;	
}
n=i;
a=x;
  	
while(a>0){
b=a%10;
c=1;
for(i=0;i<n;i++){
c=c*b;	
}	
s=s+c;	
a=a/10;		
}
  
if(s==x){
    System.out.print("it is an armstrong number");    
}
else{
    System.out.print("it is not an armstrong number");
}

}
}