public class RcursiveFibonacci {
    public static void main(String[] args) {
        for (int i=0; i<15; i++){
            System.out.println(i +"\t" + f(i));
        }
    }
    static long f(int n){
        if(n<1) return 0;
        if(n<3) return 1;
        return f(n-1)+ f(n-2);
    }
    
}
