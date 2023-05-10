// class hello <v , s>{
//     v data;
//     s data2;
//     hello(v data , s data2){
//         this.data=data;
//         this.data2 = data2;
//     }
//     public v getdata(){
//         return data;
//     }
// public s getdatas(){
//         return data2;
//     }
// }
class hello<A,S>{
    A info;
    S info1;
    hello(A info, S info1){
        this.info=info;
        this.info1=info1;

    }
    public A getdata(){
        return info;
    }
    public S getdataa(){
        return info1;
    }

}
public class Genric {
    public static void main(String[] args) {
        // hello<Integer , String> h1 = new hello(1, "hell; class");
        // System.out.println(h1.data2);
        // System.out.println(h1.getdata());
        hello<Integer, String> h1= new hello(2,"HI; class");
        System.out.println(h1.info);
        System.out.println(h1.info1);
        
    }
    
}
