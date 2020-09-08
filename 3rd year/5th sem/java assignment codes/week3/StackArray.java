import java.util.*;
class StackArray{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n=10,c=0,t=-1;
int a[]=new int [n];

while(c!=5){
System.out.print("stack options:\nchoose 1 to insert\nchoose 2 to delete\nchoose 3 to peep\nchoose 4 to display\nchoose 5 to exit:\n");
c=scan.nextInt();
switch(c){
case 1: if(t==n-1){
        System.out.print("overflow\n");
        }
        else{
        t++;
        System.out.print("enter a number: ");
        a[t]=scan.nextInt();
        }
        break;

case 2: if(t==-1){
        System.out.print("underflow\n");
        }
        
        else{
        System.out.println("deleted number is: "+a[t]);
        t--;        
        }
        break;
case 3: System.out.println("last number is: "+a[t]);
        break;
case 4: if(t==-1){
        System.out.println("stack is empty");
        }
        else{
        for(int i=0;i!=t;i++){
        System.out.print(a[i]+" ");
        }
        System.out.println(a[t]);
        }
        break;
case 5: break;
default: System.out.println("Invalid Choice");

}   
}
}    
}