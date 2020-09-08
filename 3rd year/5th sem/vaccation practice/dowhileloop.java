import java.util.Scanner;

class DoWhileLoop{
    public static void main(String args[]){

        int i=1,n;
        Scanner obj= new Scanner(System.in);
        System.out.print("enter limiting number: ");
        n=obj.nextInt();

        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }

}