interface Interface1{

void Function();
}

class Class1 implements Interface1{

public void Function(){
System.out.println("this is Class1-Function");    
}
}

class Class2 implements Interface1{

public void Function(){
System.out.println("this is Class2-Function");    
}
}

class Test{
public static void main(String args[]){

Interface1 i=new Class1();
i.Function();
i=new Class2();
i.Function();
}}