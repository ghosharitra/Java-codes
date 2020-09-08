import java.util.Scanner;

class Pattern1{

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
System.out.print("enter height of the pattern: ");
int n=scan.nextInt();

int x=1,i,j;
for(i=1;i<=n;i++){
for(j=1;j<=2*i-1;j++){
System.out.print(x+" ");
x++;
}
System.out.print("\n");
}
/*
int i,j=1,k=1,m=0;
for(i=1;i<=n;i++){
m=m+ 2*i-1;
}

for(i=1;i<=m;i++){
System.out.print(i+" ");
if(k==j){
j=j+2;
k=0;
System.out.print("\n");
}
k++;
}
*/
}
}