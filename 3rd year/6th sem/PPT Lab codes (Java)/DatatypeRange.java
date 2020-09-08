import java.math.BigInteger;
import java.util.*;
import java.io.*;



class DatatypeRange{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                BigInteger x=sc.nextBigInteger();
                BigInteger x1=new BigInteger("-128");                                      
                BigInteger x2=new BigInteger("127");   
                BigInteger x3=new BigInteger("-32768");   
                BigInteger x4=new BigInteger("32767");   
                BigInteger x5=new BigInteger("-2147483648");   
                BigInteger x6=new BigInteger("2147483647");   
                BigInteger x7=new BigInteger("-9223372036854775808");   
                BigInteger x8=new BigInteger("9223372036854775807");   
                   
                
                System.out.println(x+" can be fitted in:");
                if((x.compareTo(x1)==1 || x.compareTo(x1)==0) && (x.compareTo(x2)==-1))
                System.out.println("* byte");
                if((x.compareTo(x3)==1 || x.compareTo(x3)==0) && (x.compareTo(x4)==-1))
                {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                if((x.compareTo(x5)==1|| x.compareTo(x5)==0) && (x.compareTo(x6)==-1))
                {
                    System.out.println("* int");
                    System.out.println("* long");
                }
                if((x.compareTo(x7)==1|| x.compareTo(x7)==0) && (x.compareTo(x8)==-1))                     
                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}