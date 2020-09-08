import java.util.Scanner;

class Num{
protected int n;

public Num(int n){
this.n=n;
}

public void showNum(){
System.out.println("integer number: "+n);    
}
}

class HexNum extends Num{
String h=new String();

public HexNum(int n){
super(n);
}

public void showNum(){
String s=new String();

int no=n;

while(no>0){
if(no%16==0){
s=s.concat("0");}
else if(no%16==1){
s=s.concat("1");}
else if(no%16==2){
s=s.concat("2");}
else if(no%16==3){
s=s.concat("3");}
else if(no%16==4){
s=s.concat("4");}
else if(no%16==5){
s=s.concat("5");}
else if(no%16==6){
s=s.concat("6");}
else if(no%16==7){
s=s.concat("7");}
else if(no%16==8){
s=s.concat("8");}
else if(no%16==9){
s=s.concat("9");}
else if(no%16==10){
s=s.concat("A");}
else if(no%16==11){
s=s.concat("B");}
else if(no%16==12){
s=s.concat("C");}
else if(no%16==13){
s=s.concat("D");}
else if(no%16==14){
s=s.concat("E");}
else if(no%16==15){
s=s.concat("F");}

no=no/16;
}


//System.out.println("hexadecimal number: "+s); 
for(int i=s.length()-1;i>=0;i--){
h=h + s.charAt(i);
}
System.out.println("hexadecimal number: "+h);    
}   
}

class NumTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int n;
System.out.print("enter a integer no: ");
n=scan.nextInt();
HexNum h=new HexNum(n);
h.showNum();
}
}