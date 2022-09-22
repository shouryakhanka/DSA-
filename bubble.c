#include<stdio.h>
#include<time.h>
#include<stdlib.h>


void swap(long int *a,long int *b)
{
    int tmp=*a;
    *a=*b;
    *b=tmp;
}
void bubble(long int a[],long int n)
{
    for(long int i=0;i<n-1;i++)
    {
        for(long int j=0;j<n-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                swap(&a[j],&a[j+1]);
            }
        }
    }
}
int main()
{
   long int n=10000;
   int m=0;
   double tim1[10];
   printf("Bubble sort Size VS Sorting Time\n");
   while(m++<10)
   {
       long int a[n];
       for(int i=0;i<n;i++)
       {
           long int no=rand()%n;
           a[i]=no;
       }
       clock_t start,end;
       start=clock();
       bubble(a,n);
       end=clock();
       tim1[m]=((double)(end-start));
       printf("%d\t%d",n , (long int)tim1[m]);
       printf("\n");
       n+=10000;
   }
   return 0;
}



