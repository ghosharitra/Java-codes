import java.util.*;
class Sum2DArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int r,c,s=0,avg;
System.out.print("enter number of rows and coloumns: ");
r=scan.nextInt();
c=scan.nextInt();
int a[][]=new int [r][c];   
System.out.print("enter all the elements: ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=scan.nextInt();
s=s+a[i][j];
}}
System.out.print("sum: "+s);

}
}