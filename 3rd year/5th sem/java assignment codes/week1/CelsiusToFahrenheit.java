import java.util.*;

class CelsiusToFahrenheit{
    public static void main(String args[]){
        float c,f; 
        Scanner scan = new Scanner(System.in);
         System.out.print("Enter temperature in celsius: "); 
         c = scan.nextFloat();
         f=(c * 9/5) + 32; 
        System.out.println(f);
    }
}
