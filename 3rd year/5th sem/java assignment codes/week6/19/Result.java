package qnineteen;

public class Result extends Student implements Exam{
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
