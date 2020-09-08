import java.util.Scanner;
class Staff{
private int code;
private String name;

public Staff(int code,String name){
this.code=code;
this.name=name;
}

public void print(){
System.out.println("code: "+code);
System.out.println("name: "+name);
}
}


class Teacher extends Staff{
private String subject, publication;

public Teacher(int code,String name,String subject,String publication){
super(code,name);
this.subject=subject;
this.publication=publication;
}
    
public void print(){
super.print();
System.out.println("subject: "+subject);
System.out.println("publication: "+publication);
}
}



class Officer extends Staff{
private String grade;

public Officer(int code,String name,String grade){
super(code,name);
this.grade=grade;
}

public void print(){
super.print();
System.out.println("grade: "+grade);
}
}



class Typist extends Staff{
private double speed;

public Typist(int code,String name,double speed){
super(code,name);
this.speed=speed;
}
    
public void print(){
super.print();
System.out.println("speed: "+speed);
}
}


class RegularTypist extends Typist{
private int remuneration;
    
public RegularTypist(int code,String name,double speed,int remuneration){
super(code,name,speed);
this.remuneration=remuneration;
}
        
public void print(){
super.print();
System.out.println("remuneration: "+remuneration);
}
}



class CasualTypist extends Typist{
private int dailyWages;
        
public CasualTypist(int code,String name,double speed,int dailyWages){
super(code,name,speed);
this.dailyWages=dailyWages;
}
            
public void print(){
super.print();
System.out.println("daily wages: "+dailyWages);
}
}



class Driver{

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a,f;
String b,c,d;
double e;

System.out.println("enter code, name, subject and publication for a teacher: ");
a=scan.nextInt();
scan.nextLine();
b=scan.nextLine();
c=scan.nextLine();
d=scan.nextLine();
Teacher m=new Teacher(a,b,c,d);
m.print();


System.out.println("enter code, name, and grade for a officer: ");
a=scan.nextInt();
scan.nextLine();
b=scan.nextLine();
c=scan.nextLine();
Officer n=new Officer(a,b,c);
n.print();



System.out.println("enter code, name, speed and remuneration for a regular typist: ");
a=scan.nextInt();
scan.nextLine();
b=scan.nextLine();
e=scan.nextDouble();
f=scan.nextInt();
RegularTypist o=new RegularTypist(a,b,e,f);
o.print();


System.out.println("enter code, name, speed and daily wages for a casual typist: ");
a=scan.nextInt();
scan.nextLine();
b=scan.nextLine();
e=scan.nextDouble();
f=scan.nextInt();
CasualTypist p=new CasualTypist(a,b,e,f);
p.print();
}
}
