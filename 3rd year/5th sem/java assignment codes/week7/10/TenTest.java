import java.util.Scanner;

class Ten{
String s[];
public Ten(String s[]){
this.s=s;
}
public void exam()throws Exception{

for(int i=1;i<7;i++){
if ((0>Integer.parseInt(s[i]) || Integer.parseInt(s[i])>50)){
throw new RangeException();    
}
}

char a[]=s[0].toCharArray();
for(int i=1;i<a.length;i++){
if (!((65<=(int)a[i] && (int)a[i]<=90)  || (97<=(int)a[i] && (int)a[i]<=122))){
throw new DataTypeMismatchException();    
}
}

int r=0;
for(int i=1;i<7;i++){
int x=Integer.parseInt(s[i]);
r=r+x;
}
System.out.println("Student name: "+s[0]);
System.out.println("Total marks: "+r);
System.out.println("percentage marks: "+(r*100)/300);

}
}

class RangeException extends Exception{
public String toString(){
return "RangeException";
}
}

class DataTypeMismatchException extends Exception{
public String toString(){
return "DataTypeMismatchException";
}
}
    


class TenTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Ten obj=new Ten(args);
try{
obj.exam();
}
catch(Exception a){
System.out.println(a);
}
    
}}