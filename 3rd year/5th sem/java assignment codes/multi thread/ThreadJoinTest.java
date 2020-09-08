import java.util.ArrayList;


class Hi implements Runnable{
private int a;
private ArrayList<Integer> list;

public Hi(int a,ArrayList<Integer> list){
this.a=a;
this.list=list;
}

public void run(){



for(int i=0;i<5;i++){  
a++;  
list.add(a);
System.out.println("hi"); 
try{Thread.sleep(1000); } catch(Exception e){} 
}

notify();
}

}

class Hello implements Runnable{

public void run(){
for(int i=0;i<5;i++){    
System.out.println("hello");
try{Thread.sleep(1000); } catch(Exception e){}
}
}

}
    
class ThreadJoinTest{
private ArrayList<Integer> list=new ArrayList<Integer>();

private int a=0;

public ThreadJoinTest(){
    

Thread m=Thread.currentThread();
Runnable obj1=new Hi(a,list);
Runnable obj2=new Hello();


Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);



System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
System.out.println(m.getPriority());


t1.start();
try{Thread.sleep(500); } catch(Exception e){}
t2.start();
System.out.println(t1.isAlive());
try{
t1.join();
t2.join();
} catch(Exception e){}
System.out.println(t1.isAlive());
System.out.println("bye");

t1.getPriority();
System.out.println(m.getName());
System.out.print("a="+a);

for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" ");
}
}


public static void main(String[] args) {
ThreadJoinTest t=new ThreadJoinTest();
}
}