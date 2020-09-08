import java.util.*;
class CircleAreaPerimeter{
public static void main(String args[]){
    int a,p,r; 
    Scanner scan = new Scanner(System.in);
     System.out.println("Enter radius: "); 
     r = scan.nextInt();
     p=2*(22/7)*r;
     a=(22/7)*r*r;  
    System.out.println(p+"\n"+a);
}
}