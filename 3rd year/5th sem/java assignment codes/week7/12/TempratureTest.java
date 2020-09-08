import java.util.Scanner;
class Temprature{
protected int temp;
public Temprature(int temp){
this.temp=temp;
}
public void check(){
try{
if(5<=temp && temp<=35){
System.out.println("perfect temperature");
}
else if(5>temp){
throw new TooColdException();
}
else if(temp>35){
throw new TooHotException();
}

}
catch(TooColdException a){
System.out.println(a);
}
catch(TooHotException a){
System.out.println(a);
}


}

}


class TempratureTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Temprature t=new Temprature(scan.nextInt());
t.check();
}
}

class TooColdException extends Exception{
public String toString(){
return "TooColdException";
}

}


class TooHotException extends Exception{
public String toString(){
return "TooHotException";
}

}
