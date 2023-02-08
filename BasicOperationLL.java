class linkedList {
    Node head;
    private int size = 0;

    class Node { // Node class
        int data;// pointing the data of head
        Node next; // poinnting the next elemet of head

        Node(int data) {
            this.data = data;
            this.next = null; // iniatially it create null list
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next; // iniatially it create null list
        }
    }

    public int sizzeOfList() {
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void addAtFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;// newnode's-> next points to the head
        head = newnode; // head assign as newnode
    }

    // adding at last :
    public void addAtLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        // traverse the head;
        Node CurrentNode = head; // assign the value head to a head variable;
        while (CurrentNode.next != null) {
            CurrentNode = CurrentNode.next;
        }
        CurrentNode.next = newnode;
    }

    // insert at specific poisition:
    public void insertion(int data, int index) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (index < 0 || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node p = head;
        for (int i = 1; i < index; i++)
            p = p.next;

        newNode.next = p.next;
        p.next = newNode;
        // p.next=new Node(data, p.next);
    }

    // print list ;
    public void PrintList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("Null");
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("list is epmty");
            return;
        }

        head = head.next;
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("The List is empty .");
            return;
        }

        if (head.next == null) { // if node has only one element;
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next; // head.next=null -> lastnode=null;
        while (lastnode.next != null) {
            lastnode = lastnode.next;// null.next have no scense; that why we use second if condtition;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public void deleteAnyValue(int data) {
        Node p = head;

        while (p.next != null) {
            if (p.next.data == data) {
                p.next = p.next.next;
                return;
            }
            p = p.next;
        }
        System.out.println("this data is not aviable in the list");
    }

    public void deleteAtIndex(int index) {
        Node temp = head;
        if (head == null) {
            System.out.println("List is Epmty");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        else {
            for (int i = 1; i < index - 1; i++)
                temp = temp.next;

            temp.next = temp.next.next;
        }
    }

    public void middleElement() {
        if (head == null) {
            System.out.println("List is empty ");
            return;
        }

        Node temp = head;
        int middle_Element = sizzeOfList() / 2;
        while (middle_Element != 0) {
            temp = temp.next;
            middle_Element--;
        }
        System.out.println("Middle element is = " + temp.data);
    }

    public boolean compareEqualLists(linkedList list2) {

        if (this.head == null || list2.head == null)
            return false;

        Node p = this.head;
        Node q = list2.head;
        while (p != null && q != null) {
            if (p.data != q.data)
                return false;
            p = p.next;
            q = q.next;
        }
        return true;
    }

    public Node reverse_list() {
        // way no: 01

        // Node prev = null;
        // Node current = head;
        // Node next = null;
        // while (current != null) {
        //     next = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = next;
        // }
        // head = prev;

        //way no: 2 
        return head;
    }

    public int sumofElementInList() {
        int sum = 0;
        if (head == null) {
            System.out.println("List is empty");
        }
        Node p = head;
        while (p != null) {
            sum += p.data;
            p = p.next;
        }
        return sum;

    }
    public void MergeList(linkedList list2){
        
        Node list1=this.head;
        while(list1.next!=null)list1=list1.next;
         list1.next=list2.head;
    }
    public boolean searchElement(int target){
        
        Node temp=head;
        while(temp!=null){
            if(temp.data==target)return true;
            temp=temp.next;
        }
        return false;
    }

}
public class BasicOperationLL {
    public static void main(String[] args) {

        linkedList list = new linkedList();
        linkedList list2 = new linkedList();
        list.addAtFirst(10);
        list.addAtFirst(20);
        list.addAtFirst(30);
        list.addAtFirst(40);
        list.addAtLast(50);
        list.PrintList();
        //list two
        list2.addAtLast(100);
        list2.addAtLast(200);
        list2.addAtLast(300);
        list2.PrintList();
        list.MergeList(list2);
        list.PrintList();
System.out.println(list.searchElement(20));
        System.out.println(list.sumofElementInList());
    }
}