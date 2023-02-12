public class TowersOfHanoi {
    public static void main(String[] args) {
        int numTowers=3;
        if(args.length>0) numTowers=Integer.parseInt(args[0]);
        print(numTowers,'A','B','C');
    }

    static void print (int n,char x, char y, char z){
        if(n==1)
        System.out.println(x + "-->"+ y);
        else{
            print(n-1, x, y, z);
            System.out.println(x + "-->"+ y);
            print(n-1, x, y, z);
        }
    }
    
}
