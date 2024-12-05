package org.kodluyoruz;



public class Main {

    public static void main(String[] args) {

      GenericTypeNode<Integer> myQueue = new GenericTypeNode<>(0);

      MyThread thread0 = new MyThread(myQueue);
      MyThread thread1 = new MyThread(myQueue);

      thread0.start();
      thread1.start();

      try {
        thread0.join();
        thread1.join();
        
      } catch (InterruptedException e) {
        System.out.println("Main thread is interrupted");
      }
      System.out.println("Main thread is terminating");

    
    }
}
