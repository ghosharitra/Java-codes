class Test{
public static void main(String args[]){
//int a;

//a=2/0;
try{
display();
}
catch(Exception e){
    System.out.println("Exception");    
}
finally{
System.out.println("Finally");
}
System.out.println("After Finally");
}

public static void display()throws Exception{

try{
throw new Exception();    
}
catch(Exception e){
System.out.println("Finally");    
}
//throw new Exception();   
}

}

