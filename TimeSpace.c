void swap (x, y) {
    int t;
    t = x; // 1
    x = y; // 1
    y = t; // 1
 }

 int sum (int n, int A[]) {
    int s, i;
    s = 0; // 1
    for ( i = 0; i < n; i++) // taking the conditional statement, i.e. n + 1
    {
        s += A[i]; // n
    }
    return sum; // 1
    // Total: 2n + 3
 }

 void add(int n) {
    int i, j; // 1
    for (i = 0; i < n; i++) { // n + 1
        for (j = 0; j < n; j++) // n * (n + 1)
        {
            c[i][j] += a[i][j] + b[i][j]; // n^2
        }
 }
 }
 // Total: 1 + n * (n + 1) + n = 2n^2 + 2n + 2