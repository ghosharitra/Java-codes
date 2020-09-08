import qtwelve.*;

public class QTwelve{
public static void main(String args[]){

Vehicle v=new TwoWheeler(7, "abc", "wb7451", "xyz");
v.display();
v=new FourWheeler(2, "pqr", "mh1254", "mno");
v.display();
}
}