public class FirstMissingPositive {
    int i = 0;
    while (i < arr.length) {
        int correct = arr[i];
        if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
            swap(arr, i, correct);
        }
        else {
            i++;
        }
    }

    // search for missing no. 
    for (int index = 0; index < arr.length; index++) {
        if (arr[index] != index + 1) {
            return index + 1;
        }
    }

    // case 2
    return arr.length + 1;
}

 static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}
