public class binaryS {
    public static int binarySearchArray(int[] array, int target) {
        int startposition = 0;
        int lastposition = array.length ;
        while (startposition <= lastposition) {
            int middle = (startposition + lastposition) / 2;

            if (array[middle] == target)
                return middle;
            else if (target > array[middle])
                startposition = middle + 1;
            else
                lastposition = middle - 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,15,33,42,43,45,67,73,95,77,89,95};
        System.out.println(binarySearchArray(arr, 95));
        System.out.println(binarySearchArray(arr, 47));
    }
}
