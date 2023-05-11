
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Create the first linked list
    LinkedList<Integer> list1 = new LinkedList<>();
    list1.add(8);
    list1.add(9);
    list1.add(7);
    list1.add(6);

    // Create the second linked list
    LinkedList<Integer> list2 = new LinkedList<>();
    list2.add(5);
    list2.add(4);
    list2.add(3);

    // Add the two linked lists
    LinkedList<Integer> list3 = new LinkedList<>();
    list3.addAll(list1);
    list3.addAll(list2);

    // Calculate the height of the resulting linked list
    int height = list3.size();

    System.out.println("Sum: " + list3);
    System.out.println("Height: " + height);
  }
}
