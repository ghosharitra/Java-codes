interface Exam{

double percentCal();    
}

class Student{

protected String name;
protected int rollNo;
protected double marks1;
protected double marks2;

public Student(String name,int rollNo,double marks1,double marks2){

this.name=name;    
this.rollNo=rollNo;
this.marks1=marks1;
this.marks2=marks2;
}

public void show(){
System.out.println("name: "+name);
System.out.println("roll no: "+rollNo);
System.out.println("marks1: "+marks1);
System.out.println("marks2: "+marks2);
}

}

class Result extends Student implements Exam{
protected double per;

public Result(String name,int rollNo,double marks1,double marks2){
super(name, rollNo, marks1, marks2);
per=percentCal();
}
public double percentCal(){
double per;
per=((marks1+marks2)/200)*100;
return per;
}
public void display()
{
super.show();
System.out.println("per: "+per);
}
}

class PercentageTest{
public static void main(String args[]){

Result r=new Result("abc", 12, 84, 79);
r.display();
}}