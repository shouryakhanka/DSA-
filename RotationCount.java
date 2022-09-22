public class RotationCount {
    public static void main(String args[]) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
            }

            private static int rotationCount(int[] arr) {
                int pivot = findPivot(arr);
                return pivot + 1;
            }
            static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (mid < end && arr[mid] > arr[mid + 1]) {
                        return mid;
                    }
                    else if (mid > start && arr[mid] < arr[mid - 1]) {
                        return mid - 1;
                    }
           if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
            if (arr[start] > arr[start + 1]) {
                return start;
            }
            start ++;
        
            if (arr[end] < arr[end - 1]) {
                return end - 1;
            }
            end --;
           }
        
           else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
            start = mid + 1;
           }
           else {
            end = mid - 1;
           }
                }
                return -1;
            }
        
            public int search(int[] nums, int target) {
                int pivot = findPivot(nums);
        
                if (pivot == -1) {
                    return binarysh(nums , 0, nums.length - 1, target);
                }
                if (pivot == target) {
                    return pivot;
                }
                if (target >= nums[0]) {
                    return binarysh(nums , 0, pivot-1, target);
                }
                    return binarysh(nums, pivot+1,  nums.length - 1, target);
            }
        
                static int binarysh(int arr[], int start, int end, int target) {
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (target > arr[mid]) {
                        start = mid + 1;
                    }
                    else if (target < arr[mid]) {
                        end = mid - 1;
                    }
                    else {
                        return mid;
                    }
                }
                return -1;
        }
    }
    
