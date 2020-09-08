import java.util.Scanner;
class NumberToWord{
private int no;

public NumberToWord(int no){
this.no=no;
}
public String PrintNumberInWord(){
String word="";
if(no==0)
word="ZERO";
else if(no==1)
word="ONE";
else if(no==2)
word="TWO";
else if(no==3)
word="THREE";
else if(no==4)
word="FOUR";
else if(no==5)
word="FIVE";
else if(no==6)
word="SIX";
else if(no==7)
word="SEVEN";
else if(no==8)
word="EIGHT";
else if(no==9)
word="NINE";
return word;
}
}

class NumberToWordTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int no;

System.out.print("enter an integer between 0 to 9: ");
no=scan.nextInt();
NumberToWord a=new NumberToWord(no);
System.out.println(a.PrintNumberInWord());
}}