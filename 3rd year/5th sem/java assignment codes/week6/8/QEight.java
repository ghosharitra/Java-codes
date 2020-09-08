import qeight.*;
public class QEight{
public static void main(String args[]){

Accounts a=new SavingsAccount(5000,135,"abc","xyz",2);
a.display();
a.withdrawl(500);
a.deposit(700);
a.calculateAmount();

}
}