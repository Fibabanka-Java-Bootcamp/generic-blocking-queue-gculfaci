package org.kodluyoruz;

public class MyThread extends Thread {

    GenericTypeNode<Integer> myQueue = new GenericTypeNode<>(0);

    public MyThread(GenericTypeNode<Integer> myQueue){
        super();
		this.myQueue = myQueue;
       
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting");

        modifyThreadInteger();
        modifyThreadString();
       
        System.out.println(Thread.currentThread().getName()+ " is terminating");

    }

    public synchronized void modifyThreadInteger(){

        try {
        Thread.sleep(1000);
        myQueue.add(6);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.showAllQueue();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(500);
        System.out.println( myQueue.poll() + " polled in queue "+ Thread.currentThread().getName());
        Thread.sleep(500);
        System.out.println(myQueue.peek() + " is first element of queue "+ Thread.currentThread().getName());
        Thread.sleep(500);
        myQueue.showAllQueue();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(500);



        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interrupted");
        }
    }


    public synchronized void modifyThreadString(){



        try {

            Thread.sleep(1000);

            GenericTypeNode<String> myQueue2 = new GenericTypeNode<>(null);
            myQueue2.add("Gökhan");
            myQueue2.add("Ali");
            myQueue2.add("Tolga");
            myQueue2.add("Mehmet");
            Thread.sleep(500);
            myQueue2.showAllQueue();
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println(myQueue2.poll() + " polled in queue");
            Thread.sleep(500);
            System.out.println(myQueue2.peek() + " is first element of queue ");
            Thread.sleep(500);
            myQueue2.showAllQueue();
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interrupted");
        }
    }

    
    
}
