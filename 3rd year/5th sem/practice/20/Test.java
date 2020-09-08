import java.util.Scanner;

class Test{
public static void main(String args[])throws Exception{

int i,j;
String s;
char c;

Scanner scan=new Scanner(System.in);
i=scan.nextInt();
j=scan.nextInt();
System.out.println(i);
System.out.println(j);
int k=i & j;
System.out.println(k);

boolean l=i==j && j==k;
System.out.println(l);

boolean m=i==j & j==k;
System.out.println(m);

}
}