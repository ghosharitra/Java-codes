import java.util.Scanner;

class Account{

private int id;
private double balance;
private static double annualInterestRate;
private String dateCreated;

public Account(){
id=0;
balance=0;
dateCreated="1-1-2000";
}

public Account(int id,double balance){
this.id=id;
this.balance= balance;
dateCreated="1-1-2000";
}
public void setId(int id){
this.id=id;
}
public void setBalance(double balance){
this.balance=balance;
}    
public static void setInterest(double annualInterest){
annualInterestRate=annualInterest;
}

public int getId(){
return id;
}
public double getBalance(){
return balance;
}
public double getInterest(){
return annualInterestRate;
}
public String getDate(){
return dateCreated;
}
public double getMonthlyInterestRate(){
return annualInterestRate/12;
}
public double getMonthlyInterest(){
return ((balance*annualInterestRate)/(100*12));
}  
public void withdraw(double x){
balance=balance-x;
}
public void deposit(double x){
balance=balance+x;
}
}

class AccountTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("enter annual interest rate : ");
Account.setInterest(scan.nextDouble());
Account a=new Account();
System.out.print("enter account Id: ");
a.setId(scan.nextInt());
System.out.print("enter balance: ");
a.setBalance(scan.nextDouble());
System.out.println("monthly interest: "+a.getMonthlyInterest());
System.out.println("monthly interest rate: "+a.getMonthlyInterestRate()+"%");
System.out.print("enter account Id and balance: ");
Account b=new Account(scan.nextInt(),scan.nextDouble());
System.out.print("enter money to be deposited: ");
b.deposit(scan.nextDouble());
System.out.println("account Id: "+b.getId());
System.out.println("balance: "+b.getBalance());
System.out.println("Interest: "+b.getInterest()+"%");
System.out.println("date: "+b.getDate());
System.out.print("enter money to be whitdrawn: ");
b.withdraw(scan.nextDouble());
System.out.println("monthly interest: "+b.getMonthlyInterest());
System.out.println("monthly interest rate: "+b.getMonthlyInterestRate()+"%");
}
} 
