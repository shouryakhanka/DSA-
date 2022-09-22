public class SearchInMountain {
    public static void main(String[] args) {
        
    }
    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderagnosticBS(arr, target, 0, peak)
        if (firstTry != 0) {
            return firstTry;
        }
        return orderagnosticBS(arr, target, peak + 1, arr.length - 1);


    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in the desc part of array
                // this may be the ans, but look at the left
                // this is why end != mid - 1
                end = mid;
            }
                else {
                    // you are in the asc part of array
                    start = mid + 1; // because we know that mid + 1 element is greater than mid element
                }
                // in the end, start == end and pointing to the largest no., because of the two checks above 
// start and end is always trying to find the max element in the above two checks 
// they are pointing to just one element, that is the max because that what the checks say
// more elaboration: at every point of time for start and end they have the best possible ans till that 
// if we are saying that only one item is remaining, hence cuz of the above line i.e, the best possible ans.
                }
                return start; // or end as both are equal
            }

            static int orderagnosticBS(int[] arr, int target, int start, int end) {
                
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
