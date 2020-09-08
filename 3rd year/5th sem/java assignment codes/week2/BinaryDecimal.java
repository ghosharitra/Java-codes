import java.util.Scanner;

class BinaryDecimal{
static int s=0,t=1;

public static void binToDec(int x){
    int q,r;
    r=x%10;
    x=x/10;
    if(x>0){
    s=s+(t*r);
    t=t*2;    
    binToDec(x);	
    }
    else{
    s=s+(t*r);	
    System.out.print(s);
    	
    }	
    }
        
public static void decToBin(int x){
    int q,r;
    q=x/2;
    r=x%2;
    if(q!=0){
    decToBin(q);
    System.out.print(r);
    
    }
    else{
    System.out.print(r);
    }	
    }
    

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
System.out.print("choose 1 to convert binary to decimal\nchoose 2 to convert decimal to binary: ");
int c=scan.nextInt();
int x;
switch(c){
    case 1:System.out.print("enter a binary no: ");
    x=scan.nextInt();
    binToDec(x);
    break;
    case 2:System.out.print("enter a decimal no: ");
    x=scan.nextInt();
    decToBin(x);
    break;
    default:System.out.print("invalid choice");
}

}
}