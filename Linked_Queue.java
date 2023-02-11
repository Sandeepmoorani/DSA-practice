interface Queue{
    void push(Object obj);
    Object remove();
      int size();
      Object first();
  }

  class LinkedQueue implements Queue{
      Node head;
    int size;
    
    private  class Node{
        Object objects;
        Node next;
        Node prev;
        Node(Object onObjects){
          this.objects=onObjects;
        }

        Node(Object obj,Node prev,Node next){
            objects=obj;
            this.prev=prev;
            this.next=next;


        }
    }

    @Override
    public void push(Object obj) {
    head.prev= head.prev.next=new Node(obj);
    size++;
    
    }

    @Override
    public Object remove() {
        if(isEmpty())throw new NullPointerException();


        Object first=head.prev;
        head=head.prev.next;
        head.prev=head.prev.next.next;

        size--;
        return null;
    }



    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object first() {
        return null;
    }

    private boolean isEmpty(){return size==0;}
  }
 
  
  
public class Linked_Queue {
    public static void main(String[] args) {
        
    }
}