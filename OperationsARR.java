public class OperationsARR {
    static void print(int[] array) {
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static   int [] insertFirst(int[]arr,int value){
        int a[]=new int[arr.length+1];
        a[0]=value;
        for(int i=0;i<arr.length; i++){
            a[i+1]=arr[i];
        }
        return a;

    }
    public static int[] insertLast(int[] array,int value){
        int a[]=new int[array.length];
        a[a.length-1]=value;
        for(int i=0;i<array.length;i++){
            a[i]=array[i];
        }
        return a;
    }
    public static int[] insertIdx(int array[],int value,int index){
        if(index<0 || index>array.length)
        return array;

        int a[]=new int[array.length+1];
        int counter=0;
        for(int i=0;i<array.length;i++)
        if(i==index) a[i]=value;
        else{
            a[i]=array[counter];
            counter++;
       
        }
        return a; 
    }
    public static int[] deleteFirst(int arr[]){
        int a[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++)
        a[i]=arr[i+1];
        return a;
    }
    

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
array=insertFirst(array,12);
print(array);
// System.out.print(arr);
array=insertLast(array, 34);
print(array);
// System.out.println(arr);
    
array=insertIdx(array,45,5);
print(array);
// System.out.println(arr);

array=deleteFirst(array);
print(array);
}
}