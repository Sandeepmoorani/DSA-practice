class Node <v>{
    v data;
    Node<v> next_node;
    Node(v data){
     this.data= data;
     this.next_node = null;
    }
}
class prac<v>{
    int size;
    Node<v> head;
    prac(){
        size=0;
        head=null;
    }
        public void isempty() {
            if(size==0){
                System.out.println("List is Empty");
            }
        }
        public void insertFirst(v data) {
            Node  new_node = new Node(data);
            new_node.next_node=head;
            head=new_node;
        }
}
public class lab7 {
    
    public static void main(String[] args) {
         prac p = new prac();
        // Node<Integer> h1 = new Node<>(12);
        p.insertFirst(12);
        p.isempty();
    }
}
