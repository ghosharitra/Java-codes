import java.util.*;
class SubtractMatrix{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int r,c;
System.out.print("enter number of rows and coloumns: ");
r=scan.nextInt();
c=scan.nextInt();
int a[][]=new int [r][c];
int b[][]=new int [r][c];
int s[][]=new int [r][c];   
System.out.print("enter all the elements of first matrix: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=scan.nextInt();
}}
System.out.print("enter all the elements of second matrix: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
b[i][j]=scan.nextInt();
}}

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
s[i][j]=a[i][j]-b[i][j];
System.out.print(s[i][j]+"\t");
}
System.out.println();
}


}
}