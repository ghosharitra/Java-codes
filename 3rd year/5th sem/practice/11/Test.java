import java.util.Scanner;

class CountAndPrint{

String args[];

public CountAndPrint(String args[]){
this.args=args;
}

public void display(){


int n=args.length;
System.out.print(n+" ");
for(int i=0;i<n;i++){
System.out.print( args[i].charAt(0));
}

}

}

class Test{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
CountAndPrint obj=new CountAndPrint(args);
obj.display();
int x=51;
x=x<<x;
System.out.println(x);
}
}
