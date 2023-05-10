public class ArrayOperations {
    public static int[] insertionAtFirst(int[] oldarr, int value) {
        int[] newarr = new int[oldarr.length + 1];
        newarr[0] = value;
        for (int i = 0; i < oldarr.length; i++) {
            newarr[i + 1] = oldarr[i];
        }
        return newarr;
    }

    public static int[] insertionAtLast(int[] oldarr, int value) {
        int[] newarr = new int[oldarr.length + 1];

        for (int i = 0; i < oldarr.length; i++) {
            newarr[i] = oldarr[i];
        }
        newarr[oldarr.length + 1] = value;
        return newarr;
    }

    public static int[] insertionAtIndex(int[] oldarr, int value, int Index) {
        if (Index < 0 || Index < oldarr.length)
            return oldarr;
        int[] newarr = new int[oldarr.length + 1];
        int count = 0;
        for (int i = 0; i < oldarr.length; i++) {
            if (i == Index)
                newarr[Index] = value;
            else
                newarr[i + 1] = oldarr[i];
        }
        return newarr;
    }

    public static int[] deleteAtFirst(int[] oldarray) {
        int[] newarr = new int[oldarray.length - 1];
        for (int i = 0; i < newarr.length ; i++) {
            newarr[i] = oldarray[i + 1];
        }

        return newarr;
    }

    public static int[] deleteAtLast(int[] oldarray) {
        int[] newarr = new int[oldarray.length - 1];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = oldarray[i];
        }

        return newarr;
    }

    public static int[] deleteAtIndex(int[] oldarray, int Index) {
        if (Index < 0 || Index > oldarray.length)
            return oldarray;

        int[] newarr = new int[oldarray.length - 1];
        int count = 0;
        for (int i = 0; i < oldarray.length; i++) {
          if(i==Index){continue;}
          else{
            newarr[count]=oldarray[i];
            count++;
          }
        }

        return newarr;
    }
    public static int[] update(int[] oldarray,int index,int value){
if(index<0 || index>oldarray.length)return oldarray;

oldarray[index]=value;
return oldarray;
    }

    public static void Traverse(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 34, 5, 6, 7 };
       
        Traverse(arr);

    }
}