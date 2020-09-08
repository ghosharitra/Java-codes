package qfive;

import qfive.Interface1;

public class Class2 extends Class1 implements Interface4{


public void interface1Function1(){
System.out.println("this is Interface1-Function1");    
}
public void interface1Function2(){
System.out.println("this is Interface1-Function2");    
}

public void interface2Function1(){
System.out.println("this is Interface2-Function1");    
}
public void interface2Function2(){
System.out.println("this is Interface2-Function2");    
}

public void interface3Function1(){
System.out.println("this is Interface3-Function1");    
}
public void interface3Function2(){
System.out.println("this is Interface3-Function2");    
}

public void interface4Function1(){
System.out.println("this is Interface4-Function1");    
}

{
super.Class1Function1();
}


public void Class2Function1(){
System.out.println("this is Class2-Function1");    
}
}