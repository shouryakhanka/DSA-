#include<stdlib.h>
#include<stdio.h>

int main() {
    struct Rectangle r;

}

void initialize (struct Rectangle *r, int l, int b) {
    r-> length = l;
    r-> breadth = b;
}

int area(struct Rectangle r){
    return r.length * r.breadth;
}

void changelength(struct Rectangle *r, int l){
    r -> length = l;
}