class A{
int a;
//public A(int a){
//    this.a=a;
//    System.out.println("we are in A");
//}

}


class B extends A{

public B(){
//    super(4);
    System.out.println("we are in B");;
}

}

class C extends B{

public C(){
//super();
System.out.println("we are in C");;
}

}

class Test{
public static void main(String args[]){
C obj=new C();
}
}