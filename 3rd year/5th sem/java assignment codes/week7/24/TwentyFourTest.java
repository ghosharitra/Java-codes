import java.util.Scanner;

class Stack{
protected String element;
protected static int topOfStack=-1;
protected final static int max=5;
public void push(String element)throws OverflowException,UnderflowException{

this.element=element;
topOfStack++;
}

public String pop()throws Exception{
topOfStack--;
return element;
}

public String peep(){
return element;
}

}

class OverflowException extends Exception{
public String toString(){
return "OverflowException: stack is full";
}
}

class UnderflowException extends Exception{
public String toString(){
return "UnderflowException: stack is empty";
}
}
class TwentyFourTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int t,ch;
Stack obj[]=new Stack[Stack.max];
System.out.println("choose 1 to push an element\nchoose 2 to pop an element\nchoose 3 to peep an element\nchoose 4 to display all element");
do{
try{
System.out.print("choose: ");
ch=scan.nextInt();
switch(ch){
case 1:
scan.nextLine();
if (Stack.topOfStack==Stack.max-1){   
throw new OverflowException();    
}
obj[Stack.topOfStack+1]=new Stack();
System.out.print("enter an element: ");
String element=scan.nextLine();
obj[Stack.topOfStack+1].push(element);
break;

case 2:
if (Stack.topOfStack==-1){   
throw new UnderflowException();    
}    
String s1=obj[Stack.topOfStack].pop();
System.out.println("element: "+s1);
break;

case 3:
String s2=obj[Stack.topOfStack].peep();
System.out.println("element: "+s2);
break;

case 4:
System.out.print("stack elements:");
for(int i=0;i<=Stack.topOfStack;i++){
String s3=obj[i].peep();
System.out.print(s3+" ");
}
System.out.print("\n");
break;
default:
System.out.print("Invalid Choice");
break;
}
}
catch(OverflowException a){
System.out.println(a);   
}
catch(UnderflowException a){
System.out.println(a);   
}
catch(Exception a){
System.out.println(a);   
}
System.out.print("do you want to exit the stack: ");
t=scan.nextInt();
}while(t!=1);
    



}}