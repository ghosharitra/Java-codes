package qnineteen;

public class Student{

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
