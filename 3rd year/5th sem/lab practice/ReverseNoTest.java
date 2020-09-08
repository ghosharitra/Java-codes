import java.util.*;
class ReverseNo{

    private int num;
    public ReverseNo(int num){

        this.num=num;

    }
    public int revNo(){

        int b=0;
        while(num>0){
            int a=num%10;
            b=10*b+a;
            num=num/10;
        }
        return b;
    }

}
class ReverseNoTest{
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number : ");
        int b=scan.nextInt();
        ReverseNo x=new ReverseNo(b);
        System.out.println(x.revNo());
    }
}