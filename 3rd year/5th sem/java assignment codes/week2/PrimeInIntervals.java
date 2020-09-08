import java.util.Scanner;
class PrimeInIntervals{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter limits: ");
int a=scan.nextInt();
int b=scan.nextInt();
int t=0;

for(int j=a;j<=b;j++){
for(int i=2;i<j;i++){
if(j%i==0){ 
t=1;
break;    
}
}

if(t==0){
    System.out.print(j+" ");    
}
t=0;
}

}
}