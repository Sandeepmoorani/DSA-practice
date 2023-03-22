class LinkedQueue implements Queue {
    private Node head = new Node(null);
    private int size;
  
    private class Node {
      Object objects;
      Node next = this;
      Node prev = this;
  
      Node(Object Objects) {
        this.objects = Objects;
      }
  
      Node(Object obj, Node prev, Node next) {
        objects = obj;
        this.prev = prev;
        this.next = next;
  
      }
    }
  
    @Override
    public void push(Object obj) {
  
      head.prev = head.prev.next = new Node(obj, head.prev, head);
      size++;
  
    }
  
    @Override
    public Object remove() {
      if (isEmpty())
        throw new NullPointerException();
  
      Object first = head.next.objects;
      head.next = head.next.next;
      head.next.prev = head;
  
      --size;
      return first;
    }
  
    @Override
    public int size() {
      return size;
    }
  
    @Override
    public Object first() {
      return head.next.objects;
    }
  
    /// ----------some extra methods:
  
    public void print_Queue() {
      if (isEmpty())
        throw new NullPointerException();
  
      Node temp = head.next;
      while (temp != null) {
        if (temp.objects == null)
          return;
        System.out.print(temp.objects + " -> ");
        temp = temp.next;
  
      }
  
    }
  
    public Object[] toArray() {
      Object[] array = new Object[this.size];
      Node temp = head.next;
      int count = 0;
      while (temp != null) {
        if (temp.objects == null)
          return array;
        array[count++] = temp.objects;
        temp = temp.next;
      }
  
      return array;
  
    }
  
    // equal method:
    public boolean equal_LinkedQueue(LinkedQueue lq1) {
  
      if (this.size == lq1.size) {
        Node temp = this.head.next;
        Node p = lq1.head.next;
        while (temp != null) {
  
          if (!(temp.objects.equals(p.objects)))
            return false;
          temp = temp.next;
          p = p.next;
          if (temp.objects == null)
            return true;
  
        }
  
      }
      return true;
    }
  
    public LinkedQueue reverse_LinkedQueue() {
      Node prev = null;
      Node current = head;
      Node next = null;
      while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }
  
      return this;
    }
  
    public LinkedQueue CopyLinkedQueue(LinkedQueue lqobj) {
      this.head = lqobj.head;
      this.size = lqobj.size;
      return this;
    }
  
    public void addAtBottom(Object data) {
      if (isEmpty())
        return;
  
      // //way 01:
  
      // Node temp=head.next;
      // while(temp.next!=head){
      // temp=temp.next;
      // }
      // temp.next= new Node(data, head.prev, head);
  
      // way two:
      head.prev = head.prev.next = new Node(data, head.prev, head);
    }
  
    public void addAtFirst_Queue(Object data) {
      if (isEmpty())
        return;
  
      Node newNode = new Node(data, head, head.next);
      head.next.prev = newNode;
      head.next = newNode;
  
    }
  
    public void print_Reverse_queue() {
      if (isEmpty())
        throw new NullPointerException();
  
      Node temp = head.prev;
      while (temp != null) {
        if (temp.objects == null)
          return;
        System.out.print(temp.objects + " -> ");
        temp = temp.prev;
  
      }
    }
  
    @Override
    public boolean isEmpty() {
      return size == 0;
    }
  
    @Override
    public boolean isFull() {
      return false;
    }
  
  }
  
  public class Linked_Queue {
    public static void main(String[] args) {
      LinkedQueue lq = new LinkedQueue();
      LinkedQueue lq1 = new LinkedQueue();
      LinkedQueue lq2 = new LinkedQueue();
      lq.push("karachi");// 1 //top->karahi -> chana->
      lq.push("umerkot");// 2
      lq.push("chachro");// 3
      lq.addAtBottom("i am at bottom ");
      lq.addAtFirst_Queue("i am at first");
      // lq2.CopyLinkedQueue(lq);
      lq.print_Reverse_queue();
      // lq.print_Queue();
      // System.out.println(lq2.first());
  
      // lq2.print_Queue();
      // lq.print_Queue();
      // System.out.println("\n");
      // lq.reverse_LinkedQueue();
      // lq.print_Queue();
  
      // lq1.push("karachi");
      // lq1.push("umerkot");
      // lq1.push("chachro");
      // System.out.println(lq.equal_LinkedQueue(lq1));
      // Object[] arr=lq.toArray();
      // for(Object i:arr)System.out.println(i);
  
      // System.out.println(lq.remove());
      // System.out.println(lq.remove());
      // System.out.println(lq.remove());
    }
  }