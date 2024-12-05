package org.kodluyoruz;

public class GenericTypeNode<T> {
    private T anyValue;
    private GenericTypeNode<T> nextNode;
    private GenericTypeNode<T> head;
    private GenericTypeNode<T> tail;
    private GenericTypeNode<T> temp;


    public GenericTypeNode(T anyValue) {
        this.anyValue = anyValue;
    }

    public GenericTypeNode(T anyValue,GenericTypeNode<T> nextNode){
        this.anyValue = anyValue;
        this.nextNode = nextNode;
    }

    public synchronized T getValue(){
        return anyValue;
    }

    public synchronized void setValue(T anyValue) {
        this.anyValue = anyValue;
    }

    public synchronized GenericTypeNode<T> getNextNode(){
        return nextNode;
    }

    public synchronized void setNextNode(GenericTypeNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public synchronized void add(T anyValue){

        GenericTypeNode<T> node = new GenericTypeNode<T>(anyValue);
        if(head== null){
            head = node;
            tail = node;
        }
        else{
            tail.setNextNode(node);
            tail = node;
        }
    }
    public synchronized void showAllQueue(){
        temp = head;
        System.out.print("Queue :");
        while(temp != null){
            
            System.out.print(" - " + temp.getValue()+ " - ");
            temp = temp.getNextNode();

        }
        System.out.println("");
    }

    public synchronized T peek(){
        
        if(head != null){
            return head.getValue();
        }
        else return null;

    }

    public synchronized T poll(){
        T anyValue = null;
        if(head != null){
            GenericTypeNode<T> node = head;
            head = head.getNextNode();
            anyValue = node.getValue();
        }
        return anyValue;
    }
 
}