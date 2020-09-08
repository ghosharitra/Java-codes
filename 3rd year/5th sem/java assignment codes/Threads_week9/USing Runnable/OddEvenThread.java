class EvenThread implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            if(i%2==0){
             try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    System.out.println(e);
                }  
           System.out.println("Value of i in EVEVN THREAD"+i);
          }
        }
            System.out.println("EvenThread exit...");
    }


}
class OddThread implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            if(i%2!=0){
             try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    System.out.println(e);
                }  
           System.out.println("Value of i in ODD THREAD"+i);
          }
        }
            System.out.println("OddThread exit...");
    }


}

class OddEvenThread{
public static void main(String arg[]){
    EvenThread a=new EvenThread();
    Thread t1= new Thread(a);
    t1.start();
    OddThread b=new OddThread();
    Thread t2=new Thread(b);
    t2.start();
    System.out.println("Exiting Main...");

}

}
