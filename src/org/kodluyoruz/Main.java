package org.kodluyoruz;



public class Main {

    public static void main(String[] args) {

      GenericTypeNode<Integer> myQueue = new GenericTypeNode<>(0);
      myQueue.add(6);
      myQueue.add(1);
      myQueue.add(2);
      myQueue.showAllQueue();
      System.out.println(myQueue.poll() + " polled in queue");
      System.out.println(myQueue.peek() + " is first element of queue ");
      myQueue.showAllQueue();

      System.out.println(" ");

      GenericTypeNode<String> myQueue2 = new GenericTypeNode<>(null);
      myQueue2.add("Gökhan");
      myQueue2.add("Ali");
      myQueue2.add("Tolga");
      myQueue2.add("Mehmet");
      myQueue2.showAllQueue();
      System.out.println(myQueue2.poll() + " polled in queue");
      System.out.println(myQueue2.peek() + " is first element of queue ");
      myQueue2.showAllQueue();

    
    }
}
