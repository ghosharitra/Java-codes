import java.util.Scanner;

class CaseChange{

String s;
String ccs;
int upper=0;
int lower=0;
int digit=0;
public CaseChange(String s){
this.s=s;
}

public String change(){

char c[]=s.toCharArray();

for(int i=0;i<c.length;i++){

if(64<=c[i] && c[i]<=90){
upper++;
c[i]=(char)(c[i]+32);
}
else if(96<=c[i] && c[i]<=122){
lower++;
c[i]=(char)(c[i]-32);
}
else if(48<=c[i] && c[i]<=57){
digit++;    
}

}
ccs=new String(c);
return ccs;
}

}

class Test{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
CaseChange obj=new CaseChange(s);
System.out.println(obj.change());
System.out.println("uppercase letters count : "+obj.upper);
System.out.println("lowercase letters count : "+obj.lower);
System.out.println("digits count : "+obj.digit);
}
}
