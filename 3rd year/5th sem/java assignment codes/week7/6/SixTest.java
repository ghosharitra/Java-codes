import java.util.Scanner;

class Six{
protected String s="";

public void concatinate(char c)throws Exception{

int x=(int)c;
//System.out.println(x);
if( (65<=x && x<=90)  || (97<=x && x<=122) ){
//System.out.println("reached");
String s1=Character.toString(c);
//System.out.println(s1);
s=s.concat(s1);
System.out.println(s);
}    
else{
throw new NonAlphabeticCharacterException();        
}

}
public String getData(){
return s;    
}
}

class NonAlphabeticCharacterException extends Exception{
public String toString(){
return "NonAlphabeticCharacterException";
}
}

class SixTest{

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Six obj=new Six();
try{
char c=scan.next(".").charAt(0);
while(true){
obj.concatinate(c);
c=scan.next(".").charAt(0);
}
}
catch(Exception a){
System.out.println(obj.getData());
System.out.println(a);
}
    
    
}}