public class Recur1 {
    public static void main(String[] args) {
        
    // print first five no.s 
    print(1);
}

// static void print1(int n) {
//     System.out.println(n);
//     print2(2);
// }

// static void print2(int n) {
//     System.out.println(n);
//     print3(3);
// }

// static void print3(int n) {
//     System.out.println(n);
//     print4(4);
// }

// static void print4(int n) {
//     System.out.println(n);
//     print5(5);
// }

// static void print5(int n) {
//     System.out.println(n);
// }

static void print(int n){
    if (n == 5){
        System.out.println(5);
        return;
    }

    // this is known as tail recursion as this is the last function call
    System.out.println(n);
    print(n+1);
}
}
