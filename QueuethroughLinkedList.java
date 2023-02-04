public class QueuethroughLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head==null && tail==null;
        }

        // ADD 

        public static void add(int data){
            Node newNode= new Node(data);
            if(head==null){ 
            head=tail=newNode;
            return;
            }
            tail.next=newNode;
            tail=newNode;  
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println();
            }
        }
    }
    
}
