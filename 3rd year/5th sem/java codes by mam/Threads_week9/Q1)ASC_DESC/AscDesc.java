class AscOrder extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("Values Of i in Ascending Order"+i);
        }
    System.out.println("Exiting ascending order...");

    }//run exit



}

class DescOrder extends Thread{
    public void run(){
        for(int j=1000;j>=1;j--){
            System.out.println("Values Of j in Descending Order"+j);
        }
    System.out.println("Exiting descending order...");

    }//run exit

}

class AscDesc{
public static void main(String arg[]){

Thread t1=new AscOrder();
t1.start();
Thread t2=new DescOrder();
t2.start();
System.out.println("Exiting Main...");

}


}
