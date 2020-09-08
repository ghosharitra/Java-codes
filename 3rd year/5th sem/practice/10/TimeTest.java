import java.util.Scanner;
class Time{
private int hour,min,sec;

public Time(int hour,int min,int sec){
if(timeCheck(min,sec)){
this.hour=hour;
this.min=min;
this.sec=sec;
}else{
System.out.println("invalid time");   
}
}
public boolean timeCheck(int min,int sec){
if(min<60 && sec<60){
return true;
}else{
return false;
}
}
public Time add(Time obj2){
Time temp=new Time(0,0,0);
temp.sec=sec+obj2.sec;
if(temp.sec>=60){
temp.sec=temp.sec-60;
temp.min=1;
}
temp.min=min+obj2.min+temp.min;
if(temp.min>=60){
temp.min=temp.min-60;
temp.hour=1;
}
temp.hour=hour+obj2.hour+temp.hour;

return temp;
}
public int getHour(){
return hour;    
}
public int getMin(){
return min;    
}
public int getSec(){
return sec;    
}
}

class TimeTest{
public static void main(String args[]){
int a,b,c;
Scanner scan=new Scanner(System.in);
System.out.print("enter first time instance(hh:mm:ss): ");  
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
Time obj1=new Time(a,b,c);
System.out.print("enter first second instance(hh:mm:ss): ");  
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
Time obj2=new Time(a,b,c);
Time obj3=obj1.add(obj2);
System.out.println(obj3.getHour()+":"+obj3.getMin()+":"+obj3.getSec());

}}