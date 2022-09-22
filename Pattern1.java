public class Pattern1{
    public static void main(String[] args) {
        pattern31(4);
    }

    // static void pattern1(int n){
    //     for(int row = 1; row <= n; row++ ){
    //         for(int cols = 1;cols <= row; cols++){
    //             System.out.print("* ");
    //         }
    //         // after every 1 row, we need a new line 
    //         System.out.println();
    //     }
    // }

    // static void pattern2(int n){
    //     for(int row = 1; row <= n; row++ ){
    //         for(int cols = 1;cols <= n; cols++){
    //             System.out.print("* ");
    //         }
    //         // after every 1 row, we need a new line 
    //         System.out.println();
    //     }
    // }

    // static void pattern3(int n){
    //     for(int row = 1; row <= n; row++ ){
    //         for(int cols = 1;cols <= n - row + 1; cols++){
    //             System.out.print("* ");
    //         }
    //         // after every 1 row, we need a new line 
    //         System.out.println();
    //     }
    // }

    // static void pattern4(int n){
    //     for(int row = 1; row <= n; row++ ){
    //         for(int cols = 1;cols <= row; cols++){
    //             System.out.print(cols + " ");
    //         }
    //         // after every 1 row, we need a new line 
    //         System.out.println();
    //     }
    // }

    // static void pattern2(int n){
    //     for(int row = 1; row <= n; row++ ){
    //         for(int cols = 1;cols <= n; cols++){
    //             System.out.print("* ");
    //         }
    //         // after every 1 row, we need a new line 
    //         System.out.println();
    //     }
    // }

    // static void pattern5(int n){
    //     for(int row = 0; row < 2 * n; row++ ){
    //         int totalColumnsInRow = row > n ? 2 * n - row : row;
    //         for(int cols = 0;cols < totalColumnsInRow; cols++){
    //             System.out.print("* ");
    //         }
    //         // after every 1 row, we need a new line 
    //         System.out.println();
    //     }
    // }

    static void pattern28(int n){
        for(int row = 0; row < 2 * n; row++ ){
            int totalColumnsInRow = row > n ? 2 * n - row : row;

            int totalNoSpaces = n - totalColumnsInRow;
            for (int s = 0; s < totalNoSpaces; s++) {
                System.out.print(" ");
            }
            for(int cols = 0;cols < totalColumnsInRow; cols++){
                System.out.print("* ");
            }
            // after every 1 row, we need a new line 
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int row = 0; row < n; row++ ){

            for (int spaces = 0;spaces < n - row; spaces++) {
                System.out.print("  ");
            }

            for(int cols = row;cols >= 1; cols--){
                System.out.print(cols + " ");
            }
            for (int cols = 2; cols <= row; cols++) {
                System.out.print(cols + " ");
            }
            // after every 1 row, we need a new line 
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int row = 0; row < 2 * n; row++ ){

            int c = row > n ? 2 * n - row : row;
            for (int spaces = 0;spaces < n - c; spaces++) {
                System.out.print("  ");
            }

            for(int cols = c;cols >= 1; cols--){
                System.out.print(cols + " ");
            }
            for (int cols = 2; cols <= c; cols++) {
                System.out.print(cols + " ");
            }
            // after every 1 row, we need a new line 
            System.out.println();
        }
    }

    static void pattern31(int n){
int originalN = n;
        n = 2 * n;
        for(int row = 0; row <= n; row++ ){

            for(int cols = 0;cols <= n; cols++){
                int atEveryIndex = originalN - Math.min(Math.min(row, cols), Math.min(n - row, n - cols));
                System.out.print(atEveryIndex + " ");
            }
            // after every 1 row, we need a new line 
            System.out.println();
        }
    }
}