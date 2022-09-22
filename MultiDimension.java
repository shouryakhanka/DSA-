package
public class MultiDimension {
psvm
/*
1 2 3
4 5 6
7 8 9
*/
// int[][] arr = new int[3][];

int[][] arr = {
{1, 2, 3}, // 0th index
{4, 5, 6}, // 1st index
{7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9} 
};

int [][] arr = new int[3][3];
sopln(arr.length); // no of rows
// input

for (int row = 0; row < arr.length; row++) {
// for each column in every row
for (int col = 0; col < arr[row].length; col++) {
arr[row][col] = in.nextInt();

// output
// for (int row = 0; row < arr.length; row++) {
// for each col in every row
// for (int col = 0; col < arr[row].length; col++) {
// sopln(arr [row][col] + " ");   
// }
// sopln();
// }

// output
// for (int row = 0; row < arr.length; row++) {
// System.out.println(Arrays.toString(arr[row]));
// }

for(int[] a : arr) {
sopln(Arrays.toString(a));
}

for (String element : arr) {
sopln(element);
}
}
}
