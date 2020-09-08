package qtwo;

public class Student extends Hostel implements Dept{

protected String StudentName;
protected int enrollId;    

public Student(String HostelName, String HostelLocation, int numOfRooms,String StudentName,
int enrollId){
super(HostelName, HostelLocation, numOfRooms);
this.StudentName=StudentName;
this.enrollId=enrollId;
}
public void print(){
System.out.println("department name: "+deptName);
System.out.println("department head: "+deptHead);
System.out.println("hostel name: "+HostelName);
System.out.println("hostel location: "+HostelLocation);
System.out.println("num of rooms: "+numOfRooms);
System.out.println("hostel name: "+StudentName);
System.out.println("enrollment Id: "+enrollId);

}

}