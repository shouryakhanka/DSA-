package com.shourya;

public class Max {
psvm {
int[] arr = {1, 3, 23, 9, 18};
sopln(maxRange(arr, 1, 3));
}

// work on edge cases like array being null
static int maxRange(int[] arr, int start, int end) {

if (end > start) {
return -1; 
}

if (arr == null) {
return -1;
}

int maxVal = arr[start];
for(i = start; i < end; i++) {
if (arr[i] > maxVal) {
maxVal = arr[i];
}
return maxVal;
}

static void main (int[] arr, index1: 1, index2: 3) {
int temp = arr[index 1];
arr[index 1] = arr[index 2];
arr[index 2] = temp;
}

}
