class Parent{  

//import javafx.scene.paint.Color;
double x;
static double x1;
//a return type makes the constructor to be a normal method and applies a default constructor to the class.
public  Parent(double x){ 
//it is a normal method and not a constructor and thus java creates a default constructor which the Child class' constructor calls implicitly.
//the child class constructor can call the super class constructor implicitly as long as the super class has default or non parameterised constructor.
//for parameterised parent class constructor, the child class need to call it using super(variables) explicitly. If not, the implicit call to super class constructor will be made by sub class constructor and we will get an error saying that we are not passing enough parameters to call the super class constructor.

this.x=x;  
System.out.println(this.x);  
} 

public static void disp(double x){
x1=x;
System.out.println(x1);
}

}


class Child extends Parent{  
int y;
    public  Child(int y,double x){  
    super(x);
    this.y=y; 
    System.out.println(this.y); 
 
    } 
    
    
    }


public class Test{  
public static void main(String[] args){   
//Color.BLUE;
Child r=new Child(17,15.65);
Parent.disp(7);
} 
} 
 