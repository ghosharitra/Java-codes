/* Setting priority to threads */
		class threadA extends Thread{
		public void run() {
		System.out.println("Start Thread A ....");
		for(int i = 5; i >= 1; i--) {
        try{
        Thread.sleep(1000);
		System.out.println("From Thread A: i = "+ i);
        }catch(InterruptedException ae){
        System.out.println(ae);

        }		

        }
		System.out.println("... Exit Thread A");
		}
		}

		class threadB extends Thread{
		public void run() {
		System.out.println("Start Thread B ....");
		for(int j = 5; j >=1; j--) {
		try{
        Thread.sleep(1000);
		System.out.println("From Thread B: j = "+ j);
        }catch(InterruptedException ae){
        System.out.println(ae);

        }
		}
		System.out.println("... Exit Thread B");
		}
		}

		class threadC extends Thread{
		public void run() {
		System.out.println("Start Thread C ....");
		for(int k = 5; k>= 1; k--) {
		try{
        Thread.sleep(1000);
		System.out.println("From Thread C: k = "+k);
        }catch(InterruptedException ae){
        System.out.println(ae);

        }
		}
		System.out.println("... Exit Thread C");
		}
		}
        class threadD extends Thread{
        public void run(){
            System.out.println("From D Thread...");
            for(int p=5;p>=1;p--){
                try{
                Thread.sleep(1000);
		        System.out.println("From Thread D: p = "+ p);
                }catch(InterruptedException ae){
                System.out.println(ae);

                }
        
            }
            
            System.out.println("Exit.. D Thread..");

        }
        
        }


		class ThreadPriorityTest{
		public static void main (String args[]) {
		threadA t1 = new threadA();
		threadB t2 = new threadB();
		threadC t3 = new threadC();
        threadD t4 = new threadD();
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
		t2.setPriority(t1.getPriority()+2);
        System.out.println(t2.getPriority());
		t3.setPriority(t2.getPriority() + 2);
        System.out.println(t3.getPriority());
		t4.setPriority(t3.getPriority()+2);
        System.out.println(t4.getPriority());
		t1.start(); t2.start(); t3.start();t4.start();
		System.out.println("... End of executuion ");
	}
   }
