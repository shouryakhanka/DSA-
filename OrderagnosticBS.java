public class OrderagnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-34, -24, -12, 0, 1, 23 , 24, 43};
        int[] arr = {34, 23,12, 11, 3, 0 , -3, -4};
        int target = -3;
        int ans = orderagnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        // find whether the array is sorted in ascending order or descending order
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            // find the middle element 
            // int mid = (start + end) / 2;  might be possible that (start + end) exceeds the range of int in java 
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

                
         