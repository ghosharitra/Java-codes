import java.util.Scanner;
class Prime{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a number: ");
int a=scan.nextInt();
int t=0;
for(int i=2;i<a;i++){
if(a%i==0){
//System.out.print(a+"%"+i+"=0"); 
t=1;
break;    
}
}

if(t==0){
    System.out.print("prime");    
}
else{
    System.out.print("not prime");
}

}
}