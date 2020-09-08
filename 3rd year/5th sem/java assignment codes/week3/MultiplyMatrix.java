import java.util.*;
class MultiplyMatrix{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int r1,c1,r2,c2,s;
System.out.print("enter number of rows and coloumns for first array: ");
r1=scan.nextInt();
c1=scan.nextInt();
System.out.print("enter number of rows and coloumns for second array: ");
r2=scan.nextInt();
c2=scan.nextInt();
if(c1==r2){
    int a[][]=new int [r1][c1];
    int b[][]=new int [r2][c2];
    int c[][]=new int [r1][c2];   
    System.out.println("enter all the elements of first matrix: ");
    for(int i=0;i<r1;i++){
    for(int j=0;j<c1;j++){
    a[i][j]=scan.nextInt();
    }}
    System.out.println("enter all the elements of second matrix: ");
    for(int i=0;i<r2;i++){
    for(int j=0;j<c2;j++){
    b[i][j]=scan.nextInt();
    }}
    
    for(int i=0;i<r1;i++){
    for(int j=0;j<c2;j++){
    s=0;    
    for(int k=0;k<c1;k++){
    s=s+(a[i][k]*b[k][j]);
    }
    c[i][j]=s;    
    System.out.print(c[i][j]+"   ");
    }
    System.out.println();
    }
}else{
System.out.print("Invalid rows and columns");    
}}}