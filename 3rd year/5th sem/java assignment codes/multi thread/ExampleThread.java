class Hi extends Thread{

public void run(){
for(int i=0;i<5;i++){    
System.out.println("hi");
try{Thread.sleep(1000); } catch(Exception e){} 
}
}

}

class Hello extends Thread{

public void run(){
for(int i=0;i<5;i++){    
System.out.println("hello");
try{Thread.sleep(1000); } catch(Exception e){}
}
}

}
    
class ExampleThread{
public static void main(String[] args) {
Thread t1=new Hi();
Thread t2=new Hello();

t1.start();
try{Thread.sleep(500); } catch(Exception e){}
t2.start();
}

}