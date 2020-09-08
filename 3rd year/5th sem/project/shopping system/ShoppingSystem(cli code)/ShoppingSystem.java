import java.util.Scanner;

class Product{
protected int id;
protected String name;
protected double price;
protected static int count;
public Product(int id,String name,double price){
this.id=id;
this.name=name;
this.price=price;
}

}

class List{

public static Product[] list(){

Product p[]=new Product[5];
p[0]=new Product(0,"trial",50);
p[1]=new Product(1,"charger",200);
p[2]=new Product(2,"pen",10);
p[3]=new Product(3,"book",350);
p[4]=new Product(4,"phone",15000);
Product.count=5;
return p;
}

}

class Bill{
protected int id;
protected String name;
protected double price;
protected int quantity;

protected static int count;

public Bill(int id,String name,double price,int quantity){
this.id=id;
this.name=name;
this.price=price;
this.quantity=quantity;
}

public Bill(){
id=-1;
name="default";
price=0;
}
    


public Bill[] createBill(Product p[]){
Scanner scan=new Scanner(System.in);
Bill b[]=new Bill[10];
int c=0,t=0;
System.out.println("*enter 'done' to end your shopping and go to main menu*");
String s;
do{
System.out.print("enter product name: ");        
s=scan.nextLine();

for(int i=0;i<5;i++){
if(s.equalsIgnoreCase("done")){
break;
}
else if(s.equalsIgnoreCase(p[i].name)){
System.out.print("enter quantity: ");      
int qty=scan.nextInt();  
scan.nextLine();
b[c]=new Bill(p[i].id,p[i].name,p[i].price,qty);
c++;
t=0;
break;
}else{
t=1;        
}
}
if(t==1){
System.out.println("item not found");
t=0;
}
}while(!(s.equalsIgnoreCase("done")));
Bill.count=c;
return b;
}
}

class Menu{

public void mainMenu(){
Scanner scan=new Scanner(System.in);

System.out.println("MAIN MENU\nchoose 1 to see the list of products\nchoose 2 to add products to shopping list\nchoose 3 to checkout\nchoose 0 to exit");
System.out.print("choose: ");
int ch=scan.nextInt();
Product p[]=List.list();
Bill b[]=new Bill[5];
do{
switch(ch){
case 0:
break;
case 1:

for(int i=0;i<100;i++){
    System.out.print("-");
}
System.out.print("\n");
System.out.println("id\tname\tprice");

for(int i=0;i<100;i++){
    System.out.print("-");
}
System.out.print("\n");
for(int i=0;i<Product.count;i++){
System.out.println(p[i].id+"\t"+p[i].name+"\t"+p[i].price);    
}

for(int i=0;i<100;i++){
    System.out.print("-");
}
System.out.print("\n");
break;
case 2:
Bill obj=new Bill();
b=obj.createBill(p);
break;
case 3:
if(Bill.count!=0){

for(int i=0;i<100;i++){
    System.out.print("-");
}
System.out.print("\n");

System.out.println("id\tname\tprice\tquantity\ttotal price");

for(int i=0;i<100;i++){
    System.out.print("-");
}
System.out.print("\n");

double sum=0;
for(int i=0;i<Bill.count;i++){
System.out.println(b[i].id+"\t"+b[i].name+"\t"+b[i].price+"\t"+b[i].quantity+"\t\t"+(b[i].price * b[i].quantity)  );    
sum = sum + (b[i].price)*(b[i].quantity);
}
    
for(int i=0;i<100;i++){
System.out.print("-");
}
System.out.print("\n");
            
System.out.println("grand total price: "+sum);
            
for(int i=0;i<100;i++){
System.out.print("-");
}
System.out.print("\n");
            
}else{
System.out.print("\nno product has been selected\n");
}
break;
default:
System.out.println("invalid choice");
break;
}
System.out.print("choose: ");
ch=scan.nextInt();
}while(ch!=0);
            

}
}





class ShoppingSystem{
public static void main(String args[]){

Menu m=new Menu();
m.mainMenu();
}
}