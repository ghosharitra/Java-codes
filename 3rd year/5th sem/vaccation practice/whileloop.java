import java.util.Scanner;

class WhileLoop{
    public static void main(String args[]){

        int i=1,n;
        Scanner obj= new Scanner(System.in);
        System.out.print("enter limiting number: ");
        n=obj.nextInt();

        while(i<=n){
            System.out.println(i);
            i++;
        }
    }

}