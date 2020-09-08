import java.util.Scanner;

import javax.sql.RowSetMetaData;
class Seven{

public void capitalOfCountry(String s[])throws Exception{
int n=s.length;
for(int i=0;i<n;i++){
if(s[i].equals("india")){
System.out.println("delhi");
}
else if(s[i].equals("china")){
System.out.println("hongkong");
}
else if(s[i].equals("japan")){
System.out.println("tokyo");        
}
else{
throw new NoMatchFoundException();
}
}

}}


class NoMatchFoundException extends Exception{

public String toString(){
return "NoMatchFoundException";
}


}

class SevenTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Seven f=new Seven();
try{
f.capitalOfCountry(args);
}
catch(Exception a){
System.out.println(a);
}

}}