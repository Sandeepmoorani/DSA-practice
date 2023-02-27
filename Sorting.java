public class Sorting {

    public static void selectionsort(int[] arr) {
        int minindex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }

    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                    ;
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void insertionsort(int[] arr) {
        for (int i = 1; i > arr.length; i++) {
            int currentElement = arr[i];
            int j = i - 1;
            while (arr[j] > currentElement && j >= 0) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {

    }
}
