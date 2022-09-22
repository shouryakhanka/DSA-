#include<stdio.h>
#include<stdlib.h>

struct Node {
    int data;
    struct Node *next;
}*first = NULL, *second = NULL, *third = NULL;

void create(int A[], int n) {
    int i;
    struct node *t, *last;
    first = (struct Node*)malloc(sizeof(struct Node));
    first -> data = A[0];
    first -> next = NULL;
    last = first;

for (int i = 0; i < n; i++) {
    t = (struct Node*)malloc(sizeof(struct Node));
 t -> data = A[i];
 t -> next = NULL;
 last -> next = t;
 last = t;
}
}

void create2(int A[], int n) {
    int i;
    struct node *t, *last;
    second = (struct Node*)malloc(sizeof(struct Node));
    second -> data = A[0];
    second -> next = NULL;
    last = second;

for (int i = 0; i < n; i++) {
    t = (struct Node*)malloc(sizeof(struct Node));
 t -> data = A[i];
 t -> next = NULL;
 last -> next = t;
 last = t;
}
}


 
int main() {
    int A[] = {50, 40, 10, 30, 20};
    create(A, 5);


    Display(first);
    printf("\n\n");

    return 0;
}

