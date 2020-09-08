import qeleven.*;


public class QEleven{
public static void main(String args[]){
AbstractProduct a=new TravelGuide(123, "abc", "xyz", 5000, "pqr", "def", "mno", "india");
a.display();
a=new CompactDisc(345, "qwe", "rty", 450,"uio", "asd");
a.display();
}
}