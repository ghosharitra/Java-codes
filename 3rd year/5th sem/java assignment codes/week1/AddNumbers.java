import java.util.*;

class Number{

int no;

public Number(int no){
this.no=no;
}

public int add(Number b){
return no+b.no;
}

}


class AddNumbers{
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter two numbers: "); 
    Number a = new Number(scan.nextInt());
    Number b = new Number(scan.nextInt());  
    System.out.println("sum: "+ a.add(b));


}


}