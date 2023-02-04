import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        // if-else Conditional 

        // // int age =18;
        Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();
        // if(age>18){
        //     System.out.println("aDult");
        // }
        // if(age >13  && age<18){
        //     System.out.println("teenager");
        // }
        // else{
        //     System.out.println("not adult");
        // }
        // if(n%2==0){
        //     System.out.println("even number:");
        // }else{
        //     System.out.println("odd number");
        // }
        // int a=1, b=2, c=5;
        // if((a>=b)  && (a>c)){
        //     System.out.println("A is largest nmbr");

        // }
        //  else if( b>=c){
        //     System.out.println("b is largest nbr");
        //  }else{
        //     System.out.println("c is largest nbr");
        //  }
    // ternary operator 

    // int number =4;
    //  String type=((number%2)==0) ? "even"  : "odd";
    //  System.out.println(type);

    // switch 
     System.out.println("enter a:");
     int a= sc.nextInt();
     System.out.println("enter b :");
     int b= sc.nextInt();
     System.out.println("enter an operator :");
     char optr = sc.next().charAt(0);
     switch(optr){
        case '+': System.out.println(a+b);
        break;
        case '-': System.out.println(a-b);
        break;
        case '*': System.out.println(a*b);
        break;
        case '/': System.out.println(a/b);
        break;
        default : System.out.println("nothing");
     }

    }

    
}
