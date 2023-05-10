public class LinkedList12 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;

        } }
        public static Node head;
        public static Node tail;
        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void print(){
            if(head==null){
                System.out.println("LL in empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public void addMiddle(int indx,int data){
            Node newNode=new Node(data);
            if(indx==0){
                addFirst(data);
                return;
            }
            // Node =newnode= new Node();
            Node temp=head;
            int i=0;
            while(i<indx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public static void main(String[] args) {
            LinkedList12 l12=new LinkedList12();
            l12.addFirst(2);
            l12.addFirst(1);
            l12.addLast(4);
            l12.print();
            l12.addMiddle(1, 4);
        }

    
    
}
