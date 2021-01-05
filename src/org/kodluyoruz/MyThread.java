package org.kodluyoruz;

public class MyThread extends Thread {

    GenericTypeNode<Integer> myQueue = new GenericTypeNode<>(0);

    public MyThread(GenericTypeNode<Integer> myQueue){
        super();
		this.myQueue = myQueue;
       
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting");

        modifyThread();
       
        System.out.println(Thread.currentThread().getName()+ " is terminating");

    }

    public synchronized void modifyThread(){

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
    
}
