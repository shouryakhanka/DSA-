public class CeilingN {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceilingN(arr, target);
        System.out.println(ans);
    }
        static int ceilingN(int[] arr, int target ) {
            // what if the target is greater than the greatest element in the array
            if (target > arr.length - 1) {
                return -1;
            }
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
         
                // return the index of smallest no. >= target
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
            return start;
    }
    }
    
