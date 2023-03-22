public class QueueArray {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    
    public QueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = 0;
    }
    
    public void enqueue(int element) {
        if (rear == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear] = element;
        rear++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int removedElement = queue[front];
        front++;
        return removedElement;
    }
    
    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }
    
    public boolean isEmpty() {
        return front == rear;
    }
    
    public boolean isFull() {
        return rear == capacity;
    }
    
    public int size() {
        return rear - front;
    }
    
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        System.out.println(queue.isEmpty()); // true
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.front()); // 1
        System.out.println(queue.dequeue()); // 1
        
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.isFull()); // true
        
        try {
            queue.enqueue(6);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Queue is full
        }
        
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
        // Output: 2 3 4 5
    }
}



// ******************************* 
// public void print_Queue() {
//     if (isEmpty())
//       throw new NullPointerException();

//     Node temp = head.next;
//     while (temp != null) {
//       if (temp.objects == null)
//         return;
//       System.out.print(temp.objects + " -> ");
//       temp = temp.next;

//     }

//   }

//   public Object[] toArray() {
//     Object[] array = new Object[this.size];
//     Node temp = head.next;
//     int count = 0;
//     while (temp != null) {
//       if (temp.objects == null)
//         return array;
//       array[count++] = temp.objects;
//       temp = temp.next;
//     }

//     return array;

//   }

//   // equal method:
//   public boolean equal_LinkedQueue(LinkedQueue lq1) {

//     if (this.size == lq1.size) {
//       Node temp = this.head.next;
//       Node p = lq1.head.next;
//       while (temp != null) {

//         if (!(temp.objects.equals(p.objects)))
//           return false;
//         temp = temp.next;
//         p = p.next;
//         if (temp.objects == null)
//           return true;

//       }

//     }
//     return true;
//   }

//   public LinkedQueue reverse_LinkedQueue() {
//     Node prev = null;
//     Node current = head;
//     Node next = null;
//     while (current != null) {
//       next = current.next;
//       current.next = prev;
//       prev = current;
//       current = next;
//     }

//     return this;
//   }

//   public LinkedQueue CopyLinkedQueue(LinkedQueue lqobj) {
// this.head=lqobj.head;
// this.size=lqobj.size;
//     return this;
//   }

// public void  addAtBottom(Object data){
//     if(isEmpty())return;
 
//  // //way 01:
 
//  //    Node temp=head.next;
//  //   while(temp.next!=head){
//  //     temp=temp.next;
//  //   }
//  //   temp.next= new Node(data, head.prev, head);
 
//    // way two:
//    head.prev= head.prev.next=new Node(data, head.prev, head);
//   }



// public void addAtFirst_Queue(Object data){
//     if(isEmpty())return;
  
//     Node newNode=new Node(data, head, head.next);
//     head.next.prev=newNode;
//     head.next=newNode;
  
    
//   }
//   public void print_Reverse_queue(){
//     if (isEmpty())
//     throw new NullPointerException();
  
//   Node temp = head.prev;
//   while (temp != null) {
//     if (temp.objects == null)
//       return;
//     System.out.print(temp.objects + " -> ");
//     temp = temp.prev;
  
//   }
//   }