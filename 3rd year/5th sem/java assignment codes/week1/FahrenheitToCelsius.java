import java.util.*;

class FahrenheitToCelsius{
    public static void main(String args[]){
        float c,f; 
        Scanner scan = new Scanner(System.in);
         System.out.print("Enter temperature in fahrenheit: "); 
         f = scan.nextFloat();
         c=(f-32) * 5/9;
        System.out.println(c);
    }   
}
