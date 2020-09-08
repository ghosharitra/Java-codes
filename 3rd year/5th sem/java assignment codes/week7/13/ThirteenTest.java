import java.util.Scanner;

class Thirteen{
protected String name;
protected int age;

public Thirteen(String name,int age){
this.name=name;
this.age=age;
}
public void check()throws Exception{
if(20<=age && age<=45){
System.out.println(name+" is eligible");}
else if(20>age){
throw new TooYoungException();
}
else if(age>45){
throw new TooOldException();
}
}
}

class TooYoungException extends Exception{
public String toString(){
return "TooYoungException";
}}
    
class TooOldException extends Exception{
public String toString(){
return "TooOldException";
}}
        


class ThirteenTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Thirteen obj=new Thirteen(scan.nextLine(),scan.nextInt());
try{
obj.check();
}
catch(Exception a){
System.out.println(a);
}
    
}}