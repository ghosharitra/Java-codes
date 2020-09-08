abstract class Accounts{
protected double balance;
protected int accountNumber;
protected String accountHoldersName,address;


public Accounts(double balance,int accountNumber,String accountHoldersName,String address){
this.balance=balance;
this.accountNumber=accountNumber;
this.accountHoldersName=accountHoldersName;
this.address=address;
}

abstract public void withdrawl(int amount);  
abstract public void  deposit(int amount);
abstract public void calculateAmount();
public void display(){
System.out.println("balance of account no '"+accountNumber+"' is "+balance);
}

}

class SavingsAccount extends Accounts{
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


class AccountsTest{
public static void main(String args[]){

Accounts a=new SavingsAccount(5000,135,"abc","xyz",2);
a.display();
a.withdrawl(500);
a.deposit(700);
a.calculateAmount();

}
}