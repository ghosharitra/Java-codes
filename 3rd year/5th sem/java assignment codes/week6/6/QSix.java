import qsix.*;
import java.util.Scanner;
public class QSix {
public static void main(String args[]){

    Student s[]=new Student[100];
    Scanner scan=new Scanner(System.in);
    int ch,x=0,t,min=0,i;
    do{
    System.out.println("\nchoose 1 to admit a new student\nchoose 2 to migrate a student\nchoose 3 to display details of student");
    ch=scan.nextInt();
    scan.nextLine();
    switch(ch){
    
    case 1:{
    if (min==100){   
    System.out.println("\noverflow");
    break;   
    }
            
    System.out.println("enter hostel name,hostel location,number of rooms,student name,elective subject,avgMarks:");
    String hostelName=scan.nextLine();
    String hostelLocation=scan.nextLine();
    int numberOfRooms=scan.nextInt();
    scan.nextLine();
    String studentName=scan.nextLine();
    String electiveSubject=scan.nextLine();
    double avgMarks=scan.nextDouble();
    s[min]=new Student(hostelName,hostelLocation,numberOfRooms,studentName,electiveSubject,min,avgMarks);
    t=0;
    for(i=min+1;i<100;i++){
    if(s[i]==null){
    min=i;
    t=1;
    break;
    
    }
    }
    if(t==0){
    min=100;   
    }
    break;
    }
    case 2:{
    System.out.println("\nenter the registration number of student");
    i=scan.nextInt();
    if(s[i]==null){
    System.out.println("\nunderflow");
    break;
    }
    s[i]=null;
    if(i<min){
    min=i;    
    }
    break;
    }
    case 3:{
    System.out.print("\nenter the registration number of student: ");
    i=scan.nextInt();
    if(s[i]==null){
    System.out.println("student details not present");
    }else{
    s[i].print();
    }
    
    break;
    }
    default:System.out.println("\ninvalid choice");
    
    
    }
    System.out.println("\ndo you want to exit?\n1 for yes and 0 for no:");
    x=scan.nextInt();
    }while(x!=1);
    

}
}