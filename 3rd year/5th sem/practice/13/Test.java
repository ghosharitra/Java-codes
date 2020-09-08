import java.util.Scanner;

class ConstrChain{

int a;
int b;
int c;

public ConstrChain(){
this(5,3,1);
}

public ConstrChain(int a){
this(a,a+10,a+15);
}

public ConstrChain(int a,int b,int c){
this.a=a;
this.b=b;
this.c=c;
}

public void display(){
System.out.println("a: "+a);
System.out.println("b: "+b);
System.out.println("c: "+c);
}

}



class Test{
public static void main(String args[]){
ConstrChain obj1=new ConstrChain();
obj1.display();
ConstrChain obj2=new ConstrChain(5);
obj2.display();
}
}