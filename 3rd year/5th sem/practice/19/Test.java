import java.util.Scanner;

class Test{
public static void main(String args[])throws Exception{

int i;
String s;
char c;

Scanner scan=new Scanner(System.in);
i=scan.nextInt();
scan.nextLine();
//try{
    c=(char)System.in.read();
//}
//catch(Exception e){
//    System.out.println(e);    
//}
scan.nextLine();
s=scan.nextLine();
System.out.println(i);
System.out.println(c);
System.out.println(s);

}
}