import java.util.Scanner;

class Twelve{
protected float temparature;

public Twelve(String s[]){
temparature=Float.parseFloat(s[0]);
}
public void check()throws Exception{
if(5<=temparature && temparature<=35){
System.out.println("Normal");
System.out.println("Temperature in farenheit: "+ ((temparature*9/5)+32));
}
else if(5>temparature){
throw new TooColdException();
}
else if(temparature>35){
throw new TooHotException();
}
}
}

class TooColdException extends Exception{
public String toString(){
return "TooColdException";
}}
    
class TooHotException extends Exception{
public String toString(){
return "TooHotException";
}}
        


class TwelveTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Twelve obj=new Twelve(args);
try{
obj.check();
}
catch(Exception a){
System.out.println(a);
}
    
}}