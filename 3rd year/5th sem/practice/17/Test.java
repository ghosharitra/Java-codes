class Parent{  
int x;
//a return type makes the constructor to be a normal method and applies a default constructor to the class.
public  Parent(){ 
//it is a normal method and not a constructor and thus java creates a default constructor which the Child class' constructor calls implicitly.
//the child class constructor can call the super class constructor implicitly as long as the super class has default or non parameterised constructor.
//for parameterised parent class constructor, the child class need to call it using super(variables) explicitly. If not, the implicit call to super class constructor will be made by sub class constructor and we will get an error saying that we are not passing enough parameters to call the super class constructor.

//this.x=x;  
System.out.println(5); 
//return x; 
} 

public void Parent(){
 
    System.out.println("normal method");
}


}


class Child extends Parent{  
int y;
    public  Child(int x){  
    //super();
        y=x; 
    System.out.println(y); 
    //return y; 
    } 
    
    
    }


public class Test{  
public static void main(String[] args){   

Child r=new Child(17);
r.Parent();
} 
} 
 