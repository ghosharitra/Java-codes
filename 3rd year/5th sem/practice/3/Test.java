class B{
public void disp(String args[]){
for(int i=0;i<args.length;i++) 
System.out.println(args[i]); 
}
}

class A{

//public A(){

    static B a=new B();

//}
}

class Test{
public static void main(String ... args){
A.a.disp(args);
}
}