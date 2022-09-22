void fun1 (int n) {
    if (n > 0) {
        printf("%d", n);
        fun1(n - 1); 
    }
}

    void main() {
        int x = 3;
        fun1(x);
    }
    

//     void fun2 (int n) {
//         if (n < 0) {
//             fun2(n);
// printf("%d", n);
//         }

//         void main() {
//             int x = 4;
//             fun2(x);
//         }
//     }