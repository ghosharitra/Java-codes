import java.util.Scanner;

class Pattern2{

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
System.out.print("enter height of the pattern: ");
int n=scan.nextInt();

int i,j;
for(i=1;i<=n;i++){

for(j=1;j<=n-i;j++){
System.out.print("  ");
}  

for(j=i;j>1;j--){
System.out.print(j+" ");    
}

for(j=1;j<=i;j++){
System.out.print(j+" ");
}

System.out.print("\n");
}

}
}