package com.shourya;

public class LinearSearch {
psvm {
int[] nums = {23, 3, 5, -3, 0, 1};
int target = 0;
int ans = linearsearch(nums, target);
sopln(ans);
}

static boolean linearsearch3(int[] arr, target) {
if (arr.length == 0) {
return false; 
}
for (int element : arr) {
if (element == target) {
return true;
}
}
return false;
}

static int linearsearch2(int[] arr, target) {
if (arr.length == 0) {
return -1; 
}
for (int element : arr) {
if (element == target) {
return element;
}
}

// this line will execute if none of the return statements above have executed
// hence the target is not found 
return -1;
}

// search in the array, return the index if the is found
// otherwise if item is not found return -1

static int linearsearch(int[] arr, target) {
if (arr.length == 0) {
return -1; 
}
for (i = 0; i < arr.length; i++) {
if (arr[i] == target) {
return i;
}
}

// this line will execute if none of the return statements above have executed
// hence the target is not found 
return -1;
}
}