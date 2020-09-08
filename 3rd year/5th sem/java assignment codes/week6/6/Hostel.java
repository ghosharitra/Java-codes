package qsix;

public class Hostel{

    protected String hostelName,hostelLocation;
    protected int numberOfRooms;
    
    public Hostel(String hostelName,String hostelLocation, int numberOfRooms){
    this.hostelName=hostelName;
    this.hostelLocation=hostelLocation;
    this.numberOfRooms=numberOfRooms;
    }
    
    public void print(){
    System.out.println("hostel name: "+ hostelName);
    System.out.println("hostel location: "+ hostelLocation);
    System.out.println("number of rooms: "+ numberOfRooms);
    }
    
    }
    