class LinkedQueue {
    Node front ;
    Node rare ;
    int size = -1;

    private class Node {
        Object data;
        Node next;
        Node prev;
        Node(Object data) {
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Object data) {
        Node newnode = new Node(data);
        if (size == -1) {
            rare = front = newnode;
            size++;
        }

        rare.next = newnode;
        newnode.prev=rare;
        rare = newnode;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }

        Object first = this.front.data;
        front = this.front.next;
        size--;
        return first;

    }

    public void ReverseQueue() {
     
            if (isEmpty()) {
                System.out.println("The list is Empty");
            }
    
            Node first = rare;
            Object x=first.data;
            int count=0;
            while (count!=size) {
                System.out.print(first.data + " -> ");
                first = first.prev;
                count++;
            }
            System.out.println(" null");
       
     

    }

    public void print_LinkedQueue() {
        if (isEmpty()) {
            System.out.println("The list is Empty");
        }

        Node first = front;
        while (first!=null) {
            System.out.print(first.data + " -> ");
            first = first.next;
        }
        System.out.println(" null");
    }
}