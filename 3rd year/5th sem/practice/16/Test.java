class Parent{  

public static void print(){   
System.out.println("static method of parent");  
} 

public void print1(){   
System.out.println("print 1 method of parent");  
} 

public  void method1(){   
System.out.println("method1 of parent");  
}
} 

class Child extends Parent{  

public static void print(){   
System.out.println("static method of child");  
} 

public void print1(){   
    System.out.println("print 1 method of child");  
    } 

    
public  void method2(){   
System.out.println("method2 of child");  
}
} 

public class Test{  
public static void main(String[] args){   

Parent p=new Parent();
p.print();
Child q=new Child();
q.print();
Parent r=new Child();
r.print();//method hiding
r.print1();//method overriding
//cant call r.method1();
//cant call r.method2();

} 
} 
 