import java.util.*;
class SparseMatrix{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int r,c,m=0,n=0;
System.out.print("enter number of rows and coloumns: ");
r=scan.nextInt();
c=scan.nextInt();
int a[][]=new int [r][c];
m=r*c;   
System.out.print("enter all the elements: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=scan.nextInt();
if(a[i][j]!=0)
n++;
}}

if(n<m/2)
System.out.print("it is sparse matrix");
else
System.out.print("it is not sparse matrix");
}
}