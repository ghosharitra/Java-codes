import java.util.Scanner;

class StrReplace{

String s;
String rs;

public StrReplace(String s){
this.s=s;
}

public String change(){

rs=s.replace("a","oi");
rs=s.replaceFirst("a","oi");
rs=s.replaceAll("a","oi");
rs=s.replace('a','c');
/* 
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
*/
return rs;
}

}

class Test{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
StrReplace obj=new StrReplace(s);
System.out.println(obj.change());
}
}
