 public class Array{
     public static int[] addAtFirst(int[] array, int value) {
          int[] newarr = array;
          array = new int[array.length + 1];
          array[0] = value;
          for (int i = 0; i < newarr.length; i++) {
              array[i + 1] = newarr[i];
          }
          return array;
      }
     //  **********************

     public static int[] addAtlast(int[] array, int value) {
          int[] newarr = array;
          array = new int[array.length + 1];
          for (int i = 0; i < newarr.length; i++) {
              array[i] = newarr[i];
          }
          array[newarr.length] = value;
          return array;
      };

     //  *********************
     public static int[] addAtIndex(int[] array, int index, int value) {

          if (index > array.length) {
              System.out.println("Index out of bound of length " + array.length);
          } else {
  
              int count = 0;
              int[] newarr = array;
              array = new int[array.length + 1];
              for (int i = 0; i < array.length; i++) {
                  if (index == i) {
                      array[index] = value;
                      continue;
                  } else
                      array[i] = newarr[count];
                  count++;
  
              }
          }
          return array;
      };

     //  ***************************

     public static int[] addAtMiddle(int[] array, int value) {
          int middle = array.length / 2;
          int[] newarr = array;
          int count = 0;
          array = new int[array.length + 1];
          for (int i = 0; i < array.length; i++) {
              if (middle == i) {
                  array[i] = value;
                  continue;
              }
  
              else {
                  array[i] = newarr[count];
                  count++;
              }
  
          }
          return array;
      };



     public static void main(String[] args) {
          int[] arr = { 1,15,33,42,43,45,67,77,73,75,89,95 };
       
        arr = addAtFirst(arr, 100);
        arr = addAtlast(arr, 2000);
        arr = addAtMiddle(arr, 1500);
        arr=addAtIndex(arr, 8, 1300);
        
          
     }
}