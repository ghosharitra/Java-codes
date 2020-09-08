class Cnstr{
private int a;
public Cnstr(){
this.a=10;
}
public void getVal(){
System.out.println(a);    
}
}
class ZeroConstructor{
public static void main(String args[]){
Cnstr c =new Cnstr();
c.getVal();
}
}