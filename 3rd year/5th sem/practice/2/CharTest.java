class Char{

private char a;

public Char(){
try{
    a=(char)System.in.read();
}    
catch(Exception e){
   System.out.println(e); 
}
}

public void display(String args[]){
System.out.println("character = '"+a+"' and length of array is: "+args.length);
}
}

class CharTest{
public static void main(String args[]){
Char c=new Char();
c.display(args);
}
}