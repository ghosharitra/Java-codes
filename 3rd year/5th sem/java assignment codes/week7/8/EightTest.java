import java.util.Scanner;

class Eight{

public void factorial(String s[])throws Exception{

int a=Integer.parseInt(s[0]);
for(int i=0;i<s.length;i++){
a=Integer.parseInt(s[i]);
if(a==0){
throw new IllegalArgumentException();    
}
else{
long r=1;
for(long j=1;j<a;j++){
r=r*j;
}
System.out.println(a+"! = "+r);
}
}

}
}

class EightTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Eight e=new Eight();
try{
e.factorial(args);
}
catch(ArrayIndexOutOfBoundsException a){
System.out.println(a);
}
catch(NumberFormatException a){
System.out.println(a);
}
catch(IllegalArgumentException a){
System.out.println(a);
}
catch(Exception a){
System.out.println(a);
}
    
}}