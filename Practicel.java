
public class Test {
    public static void main(String[] args) {

        int [] arr={25,9,11,16,01,15,95};
        System.out.println("Middle of array"+arr[arr.length/2]);
        System.out.println();
        System.out.println("Last element"+arr[arr.length-1]);
        int min=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                min=arr[i];
                }
            }
        }
        System.out.println("Min of array"+min);
        System.out.println("LINKED LISTTTTT");
        LinkedList linkedList=new LinkedList();
        linkedList.add(25);
        linkedList.add(9);
        linkedList.add(11);
        linkedList.add(16);
        linkedList.add(1);
        linkedList.add(15);
        linkedList.add(95);
    linkedList.show();
    linkedList.printMiddle();
    linkedList.printLast();
    linkedList.findMin();
    }
}
class Node{
    Node next;
    int data;
}
class LinkedList{
    Node head;
    public void add(int data){
        Node node=new Node();
        node.data=data;
        if(head==null){
            head=node;
        }else{
            Node n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show(){
        Node n=head;
        while (n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }
    public void printMiddle(){
        Node current = head;
        Node middle = head;

        int length = 0;
        while (current.next!= null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.next;
            }
            current = current.next;
        }

        if (length % 2 == 0) {
            System.out.println("The middle element is " + middle.data);
        } else {
            System.out.println("The middle element is " + middle.data + " and " + middle.next.data);
        }
    }
    public void printLast(){

        Node node=head;
        while (node.next!=null){
            node=node.next;
        }
        System.out.println("Last element "+node.data);
    }
    public void findMin(){
        Node i=head;
        Node j=head;
        int min=0;
        for (i=head; i.next!=null; i=i.next){
            for (j=i.next; j.next!=null; j=j.next){
                if (i.data<j.data){
                  min=i.data;
                }
            }
        }
        System.out.println("Min of linklist "+ min);
    }
}