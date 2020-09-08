import java.util.Scanner;


class Match{

protected String s;

public Match(String s){
this.s=s;
}
public void check(){
try{
if(s.equals("University")){
System.out.println("match found");
}
else{
throw new NoMatchFoundException();    
}       
}catch(NoMatchFoundException obj){
System.out.println(obj);
}    
}

class NoMatchFoundException extends Exception{
public String toString(){
return "NoMatchFoundException";

}

}




}
class MatchTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Match m=new Match( scan.nextLine() );
m.check();
}}