public class InsetionLinkedlist {

    
    public static void main(String[] args) {
        Node newNode = new Node(x); // create a new node with value x

        if (head == null) { // check if the list is empty
            head = newNode; // set the new node to be the head of the list
        } else {
            Node current = head; // start at the head of the list
            while (current.next != null && current.next.value < x) { // find the correct position for the new node
                current = current.next;
            }
            newNode.next = current.next; // update the pointers of the new node and the adjacent nodes to insert the new
                                         // node into the list
            current.next = newNode;
        }

    }

}
