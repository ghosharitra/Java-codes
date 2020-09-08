import java.util.Scanner;
class MultipleOf{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter two number: ");
int m=scan.nextInt();
int n=scan.nextInt();
if(m%n==0){ 
System.out.print(m+" is multiple of "+n);
}
else{
System.out.print(m+" is not a multiple of "+n);
}

}
}