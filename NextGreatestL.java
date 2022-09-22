public class NextGreatestL {
    public static void main(String[] args) {
        int[] letters = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = extGreatestL(letters, target);
        System.out.println(ans);
    }
        public char NextGreatestL(char[] letters, char target ) {
            // what if the target is greater than the greatest element in the lettersay
            int start = 0;
            int end = letters.length - 1;
            while (start <= end) {
         
                // return the index of smallest no. >= target
                int mid = start + (end - start) / 2;
                if (target < letters[mid]) {
                    end = mid - 1;
                } 
                else {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];
    }
    }
