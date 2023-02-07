import java.util.Scanner;

public class Fibonacci {

  public static int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int num = sc.nextInt();
    System.out.print("The Fibonacci series of " + num + " numbers are: ");
    for (int i = 0; i < num; i++) {
      System.out.print(fibonacci(i) + " ");
    }
  }
}
