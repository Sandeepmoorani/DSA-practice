import java.util.Scanner;

public class LoopsInjava {
    public static void main(String[] args) {

        // while loop 



        // int counter = 0;
        // while(counter <100)                        //infinite while loop== while(ture)
        // System.out.println("SA Moorani");
        // counter ++;

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // int counter =1;
        // while (counter <=10){
        //     System.out.println(counter + " ");
        //     counter++;
        // }
        // System.out.println();

        // For loop 


        // for (int i=1; i<=5; i++)
        // System.out.println(i);
        // System.out.println("hello world");

        // int  sum=0, i=1;
        // while(i<=n){
        //     sum+=i;
        //     i++;
            
        // }
        // System.out.println(sum);

        // do while loop 


        // int counter=1;

        // do{
        //     System.out.println("Sandeep Moorani");
        //     counter ++;
        // } while(counter<=5);

        
        // reverse a number through a loop 


        // int n=10899;
        // while(n>0){
        //     int lastdigit=n%10;
        //     System.out.println(lastdigit +" ");
        //     n=n/10;
        // }
        // System.out.println();


        // continue statement 

        for (int i=1; i<=n; i++){
            if(i%10==0)
            continue;
            
            System.out.println(i);
        }
    }
    
}
