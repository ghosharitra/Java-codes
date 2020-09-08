package qten;

abstract public class Asset{
protected String descriptor, date;
protected double currentValue;

public Asset(String descriptor,String date,double currentValue){
this.descriptor=descriptor;
this.date=date;
this.currentValue=currentValue;
}
abstract public void displayDetails();

}
