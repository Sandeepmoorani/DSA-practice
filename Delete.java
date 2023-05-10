public class Delete {

    // delete 1st element 
    public static int[] Adelete(int [] array){
        int [] a= new int[array.length-1];
        for(int i=0; i<array.length; i++)
        a[i]=array[i+1];
        for( int i:a)
        System.out.println(i);
        return a;
        
    }
    // delete last element 

    public static int[] deletelast(int[]array){
        int [] a=
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=9;
        arr[1]=8;
        arr[2]=7;
        arr[3]=6;
        // arr[4]=5;
        Adelete(arr);
        System.out.println(arr);
        
        
    }
    
}
