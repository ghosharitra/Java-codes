class A{

public static void method(){
System.out.println("we are in class A");
}

}

class B extends A{

public static void method(){
System.out.println("we are in class B");
}   

}

class Test{

public static void main(String args[]){
A obj=new B();
obj.method();
}

}