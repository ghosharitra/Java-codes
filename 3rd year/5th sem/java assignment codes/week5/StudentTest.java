import java.util.Scanner;
class Student{
private String name;
private int roll;
private double sub1,sub2;

public Student(String name,int roll,double sub1,double sub2){
this.name=name;
this.roll=roll;
this.sub1=sub1;
this.sub2=sub2;
}
public double totalMarks(){
return sub1 + sub2;
}
public double percentage(){
return (totalMarks()/200)*100;
}
public String getName(){
return name;
}
public int getRoll(){
return roll;
}
public double getSub1(){
return sub1;
}
public double getSub2(){
return sub2;
}
}

class StudentTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
String name;
int roll,n,i;
double sub1,sub2;
System.out.print("enter number of students: ");
n=scan.nextInt();
Student s[]=new Student[n];

for(i=0;i<n;i++){
System.out.print("enter a roll number: ");
roll=scan.nextInt(); 
scan.nextLine();
System.out.print("enter name: ");
name=scan.nextLine();
System.out.print("enter marks of subject 1: ");
sub1=scan.nextDouble();
System.out.print("enter marks of subject 2: ");
sub2=scan.nextDouble();    
s[i]=new Student(name, roll, sub1, sub2);
}

System.out.println("roll\tname\tsub1\tsub2\ttotal\tpercentage");

for(i=0;i<n;i++){
System.out.println(s[i].getRoll()+"\t"+s[i].getName()+"\t"+s[i].getSub1()+"\t"+s[i].getSub2()+"\t"+s[i].totalMarks()+"\t"+s[i].percentage());        
}

}}