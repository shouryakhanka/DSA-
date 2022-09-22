import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
int[] arr = {4, 5, 1, 2, 3};
selection(arr);
System.out.println(Arrays.toString(arr));
}

static void selection(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        // find the max item in the array and swap with the corect index
        int last = arr.length - i - 1;
        int maxIndex = getMaxIndex(arr, 0, last);
        swap(arr, maxIndex, last);
        
    }

}

static void bubble(int[] arr) {
    boolean swapped;
    // run the steps n-1 times
    for (int i = 0; i < arr.length; i++) {
        swapped = false;
// for each step, max item will come at the last respective index
    for (int j = 1; j < arr.length - i; j++) {
        // swap if the item is smaller than the previous item
        if (arr[j] < arr[j-1]) {
            // swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            swapped = true;
        }
    }
    // if you did not swap for the particular value of i, it means that the array is sorted hence stop the program
if (!swapped) { // 1false = true
break;
}
    }
}

static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}

private static int getMaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
    if (arr[max] < arr[i]) {
max = i;
    }
}
return max;
}
}