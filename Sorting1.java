public class Sorting1 {
// types of sorting

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

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void insertionSort(int[] arr) {
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

    public static int partition(int[] arr, int beg, int last) {

        int pivot = arr[beg];
        int lm = beg + 1;
        int rm = last, temp;

        do {

            while (arr[rm] > pivot)
                rm--;

            while (arr[lm] <= pivot && lm < last)
                lm++;

            if (lm < rm) {
                temp = arr[rm];
                arr[rm] = arr[lm];
                arr[lm] = temp;
            }

        } while (lm < rm);

        arr[beg] = arr[rm];
        arr[rm] = pivot;
        return rm;

    }

    public static void quickSort(int[] arr, int beg, int last) {
        int p;
        if (beg < last) {
            p = partition(arr, beg, last);
            quickSort(arr, beg, p - 1);
            quickSort(arr, p + 1, last);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 180, 165, 150, 170, 145 };

        selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
