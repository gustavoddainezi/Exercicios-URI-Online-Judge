#include <stdio.h>
int main() {
    int p, r;
    scanf("%d", &p);
    scanf("%d", &r);
    
    if (p == 0) {
        printf("C\n");
    }
    else if (p == 1 && r == 0) {
        printf("B\n");
    }
    else if (p == 1 && r == 1) {
        printf("A\n");
    }
}