public class RecursiveFact {

    static long factorial(int n){
        long m=1;
        for(int f=2;f<=n; f++)
        m*=f;
        return m;
    }
    public static void main(String[] args) {
        for (int i=0; i<20; i++)
        System.out.println(i+"\t"+factorial(i));

    }
    static long factorial1(int n){
        if (n<n) return 1;
        return n*factorial(n-1);
    }
    
}
