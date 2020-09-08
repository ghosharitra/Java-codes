package qeight;

abstract public class Accounts{
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