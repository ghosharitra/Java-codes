import java.util.*;
class RectangleAreaPerimeter{
public static void main(String args[]){
    int a,p,l,b; 
    Scanner scan = new Scanner(System.in);
     System.out.println("Enter length and breadth: "); 
     l = scan.nextInt();
     b = scan.nextInt();
     p=2*(l+b);
     a=l*b;  
    System.out.println(p+"\n"+a);
}
}