import java.util.Scanner;

class Pattern3{

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
System.out.print("enter height of the pattern: ");
int n=scan.nextInt();

int i,j;
for(i=1;i<=n;i++){
if(i!=n){

for(j=1;j<i;j++){
System.out.print(" ");
}
        
System.out.print(i);
for(j=1;j<=2*(n-i)-1;j++){
System.out.print(" ");
}
System.out.print(i);

}else{
for(j=1;j<i;j++){
System.out.print(" ");
}
System.out.print(n);    
}

System.out.print("\n");
}

}
}