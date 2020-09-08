interface A1{

int VAR=1;
void methodA1();
}

interface B1 extends A1{
int VAR=2;
void methodB1();
}

abstract class A2 implements A1{

public void methodA1(){
System.out.println("we are in method A1 - class A2 implementing B2 implementing A1");
}

public void methodB1(){
System.out.println("we are in method B1 - class A2 implementing B2 implementing A1");
}

public abstract void methodB2();
}

class B2 extends A2{

public void methodB2(){
System.out.println("we are in method B2 - class B2 extending class A2 implementing B2 implementing A1");
}   

}


class B3 extends A2{

public void methodB2(){
System.out.println("we are in method B2 - class B3 extending class A2 implementing B2 implementing A1");
}   

}

class Test{

public static void main(String args[]){
//B2 obj=new B2();
final A2 obj=new B2();
obj.methodA1();
obj.methodB1();
obj.methodB2();

//final obj means that  you cant change the reference to refer it to another obj
//obj=new B3();



System.out.println(A1.VAR);
System.out.println(B1.VAR);

//System.in.read();
//System.out.println();


}
}
