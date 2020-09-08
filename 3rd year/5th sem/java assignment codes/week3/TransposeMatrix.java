import java.util.*;
class TransposeMatrix{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int r,c,s=0,avg;
System.out.print("enter number of rows and coloumns: ");
r=scan.nextInt();
c=scan.nextInt();
int a[][]=new int [r][c];
int b[][]=new int [c][r];   
System.out.println("enter all the elements:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=scan.nextInt();
}}
System.out.println("transposed matrix:");
for(int i=0;i<c;i++){
for(int j=0;j<r;j++){
b[i][j]=a[j][i];
System.out.print(b[i][j]+" ");
}
System.out.println();
}

}
}