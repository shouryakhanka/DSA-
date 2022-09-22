#include<stdio.h>
#include<stdlib.h>
#include <time.h>


//avg case
// double bubble(int a[],int n){
//     clock_t start, end;
//     double cpu_time_used;
//     start = clock();
//     int temp;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n-i;j++){
//             if(a[j]>a[j+1]){
//                 temp=a[j];
//                 a[j]=a[j+1];
//                 a[j+1]=temp;
//             }
//         }
//     }    
//     end = clock();
//     cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
//     return cpu_time_used;
// }


//best case
// double bubble(int a[],int n){
//        int temp;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n-i;j++){
//             if(a[j]>a[j+1]){
//                 temp=a[j];
//                 a[j]=a[j+1];
//                 a[j+1]=temp;
//             }
//         }
//     }    
//     clock_t start, end;
//     double cpu_time_used;
//     start = clock();
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n-i;j++){
//             if(a[j]>a[j+1]){
//                 temp=a[j];
//                 a[j]=a[j+1];
//                 a[j+1]=temp;
//             }
//         }
//     }    
//     end = clock();
//     cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
//     return cpu_time_used;
// }


//worst case
double bubble(int a[],int n){
       int temp;
    for(int i=n-1;i>=0;i--){
        for(int j=n-1;j>i;j--){
            if(a[j]>a[j-1]){
                temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
    }    
    clock_t start, end;
    double cpu_time_used;
    start = clock();
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }    
    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
    return cpu_time_used;
}



int main(){
    int n=10000;
    while(n<=100000){
    
    int a[n],i;
    for ( i = 0; i < n; i++)
    {
        a[i]=rand()%10;
    }
    
    double t = bubble(a,n);
    printf("%lf =" ,t);
    double t_best = bubble(a,n);
    printf(" %lf \t",t_best);

    FILE *fptr;
       fptr=fopen("times_bubble.csv","a+");

   if(fptr == NULL)
   {
      printf("Error!");   
      exit(1);             
   }
   fprintf(fptr,"%d\t,",n);
   fprintf(fptr,"%f\t", t);
   fprintf(fptr,"%f\n", t_best);
   n+=10000;
}
   return 0;
}
