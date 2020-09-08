import java.util.Scanner;

class Nine{

public void sum(String s[])throws Exception{

if (s.length<5){
throw new CheckArgumentException();    
}
else{
int r=0;
for(int i=0;i<s.length;i++){
int a=Integer.parseInt(s[i]);
r=r+a;
}
System.out.println("sum: "+r);        
}

}
}

class CheckArgumentException extends Exception{
public String toString(){
return "CheckArgumentException";
}
}

class NineTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Nine n=new Nine();
try{
n.sum(args);
}
catch(Exception a){
System.out.println(a);
}
    
}}