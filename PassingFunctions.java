package com.shourya;
import java.util.Arrays;
public class PassingFunctions {
public static void main(String[] args) {
int[] nums = {3. 4. 21. 11};
sopln(Arrays.toString(nums));
change(nums);
sopln(Arrays.toString(nums));
}
static void change(int[] arr) {
arr[0] = 99;
}
}