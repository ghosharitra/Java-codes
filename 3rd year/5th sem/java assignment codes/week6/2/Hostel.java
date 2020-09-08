package qtwo;

public class Hostel{

protected String HostelName, HostelLocation;
protected int numOfRooms;    

public Hostel(String HostelName, String HostelLocation, int numOfRooms){
this.HostelName=HostelName;
this.HostelLocation=HostelLocation;
this.numOfRooms=numOfRooms;
}
public void print(){
System.out.println("hostel name: "+HostelName);
System.out.println("hostel location: "+HostelLocation);
System.out.println("num of rooms: "+numOfRooms);
}

}