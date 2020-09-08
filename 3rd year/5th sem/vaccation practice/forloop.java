import java.util.Scanner;

class ForLoop{
    public static void main(String args[]){

        int i=1,n;
        Scanner obj= new Scanner(System.in);
        System.out.print("enter limiting number: ");
        n=obj.nextInt();

        for(i=1;i<=n;i++){
            System.out.println(i);
        }
    }

}