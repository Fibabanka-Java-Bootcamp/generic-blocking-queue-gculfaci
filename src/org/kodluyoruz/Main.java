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

      /*System.out.println(" ");

      GenericTypeNode<String> myQueue2 = new GenericTypeNode<>(null);
      myQueue2.add("Gökhan");
      myQueue2.add("Ali");
      myQueue2.add("Tolga");
      myQueue2.add("Mehmet");
      myQueue2.showAllQueue();
      System.out.println(myQueue2.poll() + " polled in queue");
      System.out.println(myQueue2.peek() + " is first element of queue ");
      myQueue2.showAllQueue();*/

    
    }
}
