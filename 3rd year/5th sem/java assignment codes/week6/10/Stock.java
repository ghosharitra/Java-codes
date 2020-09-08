package qten;

public class Stock extends Asset{
protected int numShares;
protected double sharePrice;

public Stock(String descriptor,String date,double currentValue,int numShares,double sharePrice){
super(descriptor,date,currentValue);
this.numShares=numShares;
this.sharePrice=sharePrice;
}

public void displayDetails(){
System.out.println("descriptor: "+descriptor);
System.out.println("date: "+date);
System.out.println("current value: "+currentValue);
System.out.println("no. of shares: "+numShares);
System.out.println("share price: "+sharePrice);
}

}
