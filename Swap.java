package com.shourya;

public class Swap {
psvm {
 int[] arr = {1, 3, 23, 9, 18};
// swap(arr, 1, 3);
reverse(arr);
sopln(Arrays.toString(arr));
}


static void reverse(int[] arr) {                  // this is known as two pointer method 
int start = 0;
int end = arr.length-1;

while (start < end) {
swap (arr, start, end);
start++;
end--;
}
}

static void main (int[] arr, index1: 1, index2: 3) {
int temp = arr[index 1];
arr[index 1] = arr[index 2];
arr[index 2] = temp;
}

}

// output

[1, 9, 23, 3, 18]