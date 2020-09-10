#include <stdio.h>
int main(){
    int I, J;
    for(I = 1, J = 60; J >= 0; I += 3, J -= 5) {
        printf("I=%d J=%d\n", I, J);
    }
    return 0;
}