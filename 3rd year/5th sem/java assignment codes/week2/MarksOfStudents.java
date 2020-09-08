import java.util.*;

class MarksOfStudents{

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
int n,i,j,a[][],s1=0,r1=0,s2=0,r2=0,s3=0,r3=0,t=0,r4=0;

n=scan.nextInt();
a=new int[n][4];


for(i=0;i<n;i++){
a[i][0]=scan.nextInt();
a[i][1]=scan.nextInt();
a[i][2]=scan.nextInt();
a[i][3]= a[i][0]+a[i][1]+a[i][2];
}

for(i=0;i<n;i++){
if(s1<a[i][0]){
s1=a[i][0];
r1=i+1;
}
if(s2<a[i][1]){
s2=a[i][1];
r2=i+1;}
if(s3<a[i][2]){
s3=a[i][2];
r3=i+1;}

if(t<a[i][3]){
t=a[i][3];
r4=i+1;}
}


for(i=0;i<n;i++){
j=i+1;
System.out.println("total marks by roll "+j+" is: "+a[i][3]);
}


System.out.println("max marks in subject 1 is: "+s1+" by roll no."+r1);
System.out.println("max marks in subject 2 is: "+s2+" by roll no."+r2);
System.out.println("max marks in subject 3 is: "+s3+" by roll no."+r3);
System.out.println("max total marks  is: "+t+" by roll no."+r4);


}

}
