public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 34};
        System.out.println(binarySearch(arr, 5));

    }
    public static int binarySearch(int[] a, int n){
        int low = 0;
        int high = a.length - 1;
        while (high >= low){
            int mid = (low + high)/ 2;
            if (n < a[mid]) high = mid -1;
            else if (n == a[mid]) return mid;
            else low = mid + 1;
        }
        return -1;
    }
}
