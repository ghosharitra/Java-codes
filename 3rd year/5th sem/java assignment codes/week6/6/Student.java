package qsix;

//import qsix.Department;

public class Student extends Hostel implements Department{

    protected String studentName,electiveSubject;
    protected int regdNo;
    protected double avgMarks;
        
    public Student(String hostelName,String hostelLocation, int numberOfRooms,String studentName,String electiveSubject,int regdNo,double avgMarks){
    super(hostelName,hostelLocation,numberOfRooms);
    this.studentName=studentName;
    this.electiveSubject=electiveSubject;
    this.regdNo=regdNo;
    this.avgMarks=avgMarks;
    }
        
    public void print(){
        super.print();
        System.out.println("department name: "+ deptName);
    System.out.println("department head: "+ deptHead);
        
    System.out.println("student name: "+ studentName);
    System.out.println("elective subject: "+ electiveSubject);
    System.out.println("registration no: "+ regdNo);
    System.out.println("average marks: "+ avgMarks);
    }    
    }
    