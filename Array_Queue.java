import java.util.Queue;

class ArrayQueue implements Queue {
    private Object[] array;
    private int size;
    private int rare = -1;

    ArrayQueue(int size){
        this.size=size;
        array=new Object[size];
    }

    public boolean isEmpty() {
        return rare == -1;
    }

    @Override
    public void push(Object obj) {
        if (rare == array.length) {
            System.out.println("full");
        }

        rare++;
        array[rare] = obj;
    }

    @Override
    public Object remove() {
        if (isEmpty()) {
            System.out.println("null");
            return null;
        }

        Object front = array[0];
        for (int i = 0; i < rare; i++) {
            array[i] = array[i + 1];
        }
        rare--;
        // size--;

        return front;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object first() {
        if (isEmpty()) {
            System.out.println("null");
            return null;
        }
        
        return array[0];
    }
    
    public void print_ArrayQueue(){
        if (isEmpty()) {
            System.out.println("null");
            return ;
        }

        for(int i=0;i<=rare;i++){
            System.out.print(array[i]+" <- ");
        }
        System.out.print("null");
        
    }
}
// here in this file i use array through Queue 

public class Array_Queue {
    public static void main(String[] args) {
       ArrayQueue aq=new ArrayQueue(10);
         aq.push("kelash");
         aq.push("Devraj");
         aq.push("Vijay");
        //  System.out.println(aq.first());
        //  System.out.println(aq.remove());
        //  System.out.println(aq.remove());
        //  System.out.println(aq.remove());
        //  aq.print_ArrayQueue();
      
    }
}