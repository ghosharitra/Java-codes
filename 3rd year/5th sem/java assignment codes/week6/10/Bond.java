package qten;

public class Bond extends Asset{
protected double interestRate;

public Bond(String descriptor,String date,double currentValue,double interestRate){
super(descriptor,date,currentValue);
this.interestRate=interestRate;
}
public void displayDetails(){

System.out.println("descriptor: "+descriptor);
System.out.println("date: "+date);
System.out.println("current value: "+currentValue);
System.out.println("interest rate: "+interestRate);
}

}
