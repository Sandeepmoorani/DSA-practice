

import java.util.*;

// import StacksLinkedlist.Node.stack;

public class StacksLinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        public static class stack{
            static Node head=null;

            public static boolean isEmpty(){
                return head==null;
            }
            // push 


            public static void push(int data){
                Node newNode= new Node(data);
                if(isEmpty()){
                    head=newNode;
                    return;
                }
                newNode.next=head;
                head=newNode; 

            }

            // pop 

            public static int pop() {
                if(isEmpty()){
                    return -1;
                }
                 int top=head.data;
                 head=head.next;
                 return top;
            }

            // peek 

            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                 return head.data;
            }
         }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
        
    
    
// }
// public class StacksLinkedlist implements Stack{
//     private Node top;
//     private int size;
//     public static class Node{
//         Object object;
//         Node next;
//         Node(Object obj, Node n){
//             object =obj;
//             next=n;
//         }
//     }
//     public Object peek(){
//         if(size==0)
//         return top.object;
//         return size;
//     }
//     // public Object pop(){
//     //     // Object object;
//     //     if(size==0)
//     //      Object temp = top.object;
//     //     top=top.next;
//     //     --size;
//     //     return temp;
//     // }
//     public void push(Object obj){
//         top=new Node(obj,top);
//         ++size;
//     }
//          public static void main(String[] args) {
//             Stack s= new Stack();
//                 s.push(1);
                
//             ;
//          }
// }