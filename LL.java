// public  class LL {
//     // Node head;
//  public static class Node{
//  int data;
//  Node next;

//  public Node(int data){
//     this.data=data;
//     this.next=null;
//  } 
//  public static Node head;
//  public static Node tail;

//  public  void addfirst(int data){
//     // step1. create a new node 
//     Node newnode=new Node(data);
//     if(head==null){
//         head=tail=newnode;
//         return;
//     }
//     // step2. newnode head=next;
//     newnode.head=next;

//     // step3. head = newnode
//     head=newnode;
//  }

// }
// //  public  void InsertAtFirst(int data){
// // Node newnode =new Node(data);
// //     if(head==null){
// //         head=newnode;
// //         return;
// //     }

// //     newnode.next=head;
// //     head=newnode;

// //  }
// //  public  void InsertAtLast(int data){
// // Node newnode =new Node(data);
// //     if(head==null){
// //         head=newnode;
// //         return;
// //     }
// //     Node temp=head;
// //     while(temp.next!=null){
// //         temp=temp.next;
// //     }
// //    temp.next=newnode;

// //  }

// //  public void travese(){
// //     if(head==null){
// //         System.out.println("list is null ");
// //     }
// //     Node temp=head;
// //     while(temp!=null){
// //         System.out.print(temp.data+" ");
// //         temp=temp.next;
// //     }
// //  }
//  public static void main(String[] args) {
//     LL list1=new LL();
//     // list1.InsertAtFirst(12);
//     // list1.InsertAtFirst(13);
//     // list1.InsertAtFirst(14);
//     // list1.InsertAtFirst(15);

//     // list1.InsertAtLast(11);
//     // list1.travese();
//     list1.addfirst(1);
//     list1.addfirst(2);
//  }


// }

public class LL{
   public static class Node{
      int data;
      Node next;

     public Node(int data){
         this.data=data;
         this.next=null;
      }}
      public static Node head;
      public static Node tail;

      public void AddFirst(int data){
         Node newNode=new Node(data);
         if(head==null){ 
         head=newNode;
         return;}
         newNode.next=head;
         head=newNode;  
   }
   public void addLast(int data){
      Node newnode=new Node(data);
      if(head==null){
         head=newnode;
         return;
      }
      else{
         tail.next=newnode;
         tail=newnode;
      }
   }
   public void print(){
      if(head==null){ 
      System.out.println("ll is empty");
      return;}
      Node temp=head;

      while(temp!=null){ 
      System.out.println(temp.data+" ");
      temp=temp.next;}
      System.out.println();
   }
   // public void print(){
   //    Node newNode=new Node(0);
   //    if(head==null){
   //       head=newNode;
   //       return;
   //    }
   //    Node temp=head;
   //    while(temp!=null){
   //       System.out.println(temp.data+" ");
   //       temp=temp.next;
   //       System.out.println();
   //    }

   // }
   public static void main(String[] args) {
      LL l1= new LL();
      l1.AddFirst(2);
      l1.AddFirst(1);
      l1.addLast(34);
      l1.print();

      
      
   }
}