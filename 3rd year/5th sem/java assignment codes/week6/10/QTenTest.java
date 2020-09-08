import qten.*;

public class QTenTest{
public static void main(String args[]){
Asset a=new Stock("xyz","30-aug-19",50000,500,2000);
a.displayDetails();

a=new Bond("pqr","31-aug-19",54000,5.8);
a.displayDetails();

a=new Savings("lmn","25-aug-19",70000,8);
a.displayDetails();

}
}
