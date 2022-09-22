public class BinaryWRecur {
    public static void main(String[] args) {
int[] arr = {-1, -5, 0, 5, 7};
System.out.println(binary(arr, 77, 0, arr.length - 1));        
    }

    static int binary(int[] arr, int target, int s, int e) {
       if (s > e){
        return -1;
       }
       int m  = s + (e - s) / 2;

       if (target == arr[m]){
        return m;
       }
       if (target >= arr[m]){
        return binary(arr, target, m + 1, e);
       }
        return binary(arr, target, s, m - 1);

    }
    
}
