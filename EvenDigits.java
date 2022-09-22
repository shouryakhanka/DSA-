public class EvenDigits {
   public static void main(String[] args) {
    int[] nums = {32, 2434, 3, 0, 324};
    //System.out.println(findNumbers(nums));
    System.out.println(digits2(-212421));
   }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    // function to check whether the no. contains even digit or not
    static boolean even(int num) {
        int noOfDigits = digits(num);
        // if (noOfDigits % 2 == 0)
        // {
        //     return true;
        // }
    //return false;
    return noOfDigits % 2 == 0;

    }

    static int digits2(int num) {
        if(num < 0) {
            num*= -1;
        }

        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num) {
        int count = 0;
        if(num < 0) {
            num*= -1;
        }
        if (num == 0) {
            return 0;
        }
        while (num > 0) {
            count++;
            num/=10;
        }
        return count;
    }
   } 
