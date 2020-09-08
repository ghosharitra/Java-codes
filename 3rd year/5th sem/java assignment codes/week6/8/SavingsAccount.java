package qeight;
public class SavingsAccount extends Accounts{
protected double rateOfInterest;

public SavingsAccount(double balance,int accountNumber,String accountHoldersName,String address,double rateOfInterest){
super(balance,accountNumber,accountHoldersName,address);
this.rateOfInterest=rateOfInterest;
}

public void calculateAmount(){
System.out.println("interest amount: "+(rateOfInterest* balance)/100);
}

public void withdrawl(int amount){
balance=balance-amount;
System.out.println("amount withdrawed:"+ amount);
System.out.println("current balance:"+ balance);
}

public void deposit(int amount){
balance=balance+amount;
System.out.println("amount deposited:"+ amount);
System.out.println("current balance:"+ balance);
}

}
