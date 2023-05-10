class Node<A>{
    A data;
    Node<A> next;
    Node(A data){
        this.data = data;

    }

}
class generic <t>{
    int size ;
    Node<t> head;
    generic(){
        size=0;
        head=null;

    }
    public void insertFirst(t data) {
        Node <t> new_node = new Node<>(data);
        new_node.next=head;
        head=new_node;
    }
    public void disply(){
        Node<t> disply= head;
        while(disply!=null){
            System.out.println(disply.data);
            disply=disply.next;
        }
    }
}

public class LinkedlistGenric {

    public static void main(String[] args) {
        Node <Integer> n = new Node<>(12);
        generic<Integer> g1 = new generic<>();
        g1.insertFirst(22);
        g1.insertFirst(99);
        g1.disply();
    }

}
