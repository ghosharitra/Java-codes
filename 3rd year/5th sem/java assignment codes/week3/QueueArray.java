import java.util.*;
class QueueArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n=10,c=0,h=-1,t=-1;
int a[]=new int [n];


while(c!=5){
System.out.print("queue options:\nchoose 1 to insert\nchoose 2 to delete\nchoose 3 to peep\nchoose 4 to display\nchoose 5 to exit:\n");
c=scan.nextInt();
switch(c){
case 1: if(h==-1){
        h++;
        t++;
        System.out.print("enter a number: ");
        a[t]=scan.nextInt(); 
        }
        else if((t==n-1 && h==0) || t==h-1){
        System.out.println("overflow\n");
        }
        else if(t==n-1){
        t=0;
        System.out.print("enter a number: ");
        a[t]=scan.nextInt();
        }
        else{
        t++;
        System.out.print("enter a number: ");
        a[t]=scan.nextInt();
        }
        break;
        
case 2: if((h==n && t==n-1)||(h==-1)){
        System.out.println("underflow\n");
        }
        else if(h==n-1 && t!=n-1){
        System.out.println("deleted number is: "+a[h]);
        h=0;
        }
        else if(h==t){
        System.out.println("deleted number is: "+a[h]);
        h=-1;
        t=-1;        
        }
        else{
        System.out.println("deleted number is: "+a[h]);
        h++;
        }
        break;

case 3: System.out.println("first number is: "+a[h]);
        break;
case 4: if(h==-1){
    System.out.println("queue is empty");
        }
        else{
        for(int i=h;i!=t;i++){
        if(i==n-1 && t!=n-1)
        i=0;
        System.out.print(a[i]+" ");
        }
        System.out.println(a[t]);
        }
        break;
case 5: break;
default: System.out.println("Invalid Choice");

} }  
    
}}