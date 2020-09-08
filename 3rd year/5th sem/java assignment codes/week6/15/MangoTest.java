abstract class Mango{
abstract public void display();
}

class Summer extends Mango{

public void display(){
System.out.println("Mango is a summer-time fruit");
}
}

class Winter extends Mango{

public void display(){
System.out.println("Mango is a winter-time fruit");
}
}


class  MangoTest{
public static void main(String args[]){
Mango m=new Summer();
m.display();
m=new Winter();
m.display();

}}