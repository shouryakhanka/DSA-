public class BinarySearch {
    public static void main(String[] args) {
        // return the index 
        // return -1 if it does not exist
int[] arr = {-34, -24, -12, 0, 1, 23 , 24, 43};
int target = 1;
        int ans = binarysh(arr, target);
        System.out.println(ans);
    }
        static int binarysh(int[] arr, int target ) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                // find the middle element 
                // int mid = (start + end) / 2;  might be possible that (start + end) exceeds the range of int in java 
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } 
                else if (target > arr[mid]) {
                    start = mid + 1;
                }
                else 
                return mid;
            }
            return -1;
    }
}
