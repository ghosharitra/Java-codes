import java.util.Scanner;
class Item{

private int code,price;

public Item(int code,int price){
this.code=code;
this.price=price;
}
public int dispCode(){
return code;
}

public int dispPrice(){
return price;
}
}
class ItemTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int n,i,a,b,tp=0;
System.out.print("enter no of items: ");
n=scan.nextInt();
Item x[]=new Item[n];
for(i=0;i<n;i++){

System.out.print("enter code and price: ");
a=scan.nextInt();
b=scan.nextInt();
x[i]=new Item(a,b);
}

System.out.println("code price: ");
for(i=0;i<n;i++){
System.out.println(x[i].dispCode()+"\t"+x[i].dispPrice());
tp=tp+x[i].dispPrice();
}
System.out.println("total price of all items is "+tp);
} }
