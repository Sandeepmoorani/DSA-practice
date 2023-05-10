class Node {
    int data;
    Node next;
    Node previous ;
    Node(int data){
        this.data=data;
    }

}
public class doubling {
    public static Node addditem (int data , Node head) {
        Node new_node = new Node(data);
        if(head==null){
         head = new_node;
        }
        head.next = new_node;
        new_node.previous=head;
        head=new_node;
        return head;
    }
    public static void disply(Node head) {
for (Node i = head; i!=null ; i=i.next) {
            System.out.print(i.data + " ");
}
    }
    public static void main(String[] args) {
        Node head = new Node(12);
        Node newa =  addditem(1, head);
       Node ba = addditem(33, newa);
        disply(ba);
    }
}
