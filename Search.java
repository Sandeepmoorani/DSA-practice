import java.util.Scanner;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }

    // for(Node p=start; p!=null; p=p.next)
    // {

    // }
}

public class Search{
    public static void main(String[] args) {
        int[] array={29,35,45,55,65,75,95};

        int f=0; 
        int count=0;
                 
        for(int i=count; i<array.length; i++)
        {
            ++count;
        }
        System.out.println(count);

        int mid=count/2;
        int last=array.length-1;

        System.out.print("Mid element is : "+array[mid]);

        
        System.out.println("\nLast  element is : "+array[last]);
         Node l1 = new Node(5);
         l1.next = new Node(7);
         l1.next.next = new Node(9);
         l1.next.next = new Node(11);

    }
        
    }