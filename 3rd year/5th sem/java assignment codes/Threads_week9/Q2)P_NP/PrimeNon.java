class Prime extends Thread{
public void run(){
    for(int i=2;i<=1000;i++){
        int flag=1;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                 flag=0;
                break;
            }
    
         }
        if(flag==1)
            System.out.println("Prime NO.="+i);
    }
    System.out.println("Exiting Prime...");
}//run exit
}
class NonPrime extends Thread{
public void run(){
    for(int i=2;i<=1000;i++){
        int flag=1;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                 flag=0;
                break;
            }
    
         }
        if(flag==0)
           System.out.println("NON Prime NO.="+i);
    }
    System.out.println("Exiting Non Prime...");
}//run exit
}

class PrimeNon{
public static void main(String arg[]){
Thread t1=new Prime();
Thread t2=new NonPrime();
t1.start();

t2.start();
    
System.out.println("Exiting Main...");

}

}
