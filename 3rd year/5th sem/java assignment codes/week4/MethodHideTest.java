class Parent{  

public static void print(){   
System.out.println("static method of parent");  
} 
} 

class Child extends Parent{  

public static void print(){   
System.out.println("static method of child");  
} 
} 

public class MethodHideTest{  
public static void main(String[] args){   

Parent p=new Parent();
p.print();
Child q=new Child();
q.print();
Parent r=new Child();
r.print();

} 
} 
 