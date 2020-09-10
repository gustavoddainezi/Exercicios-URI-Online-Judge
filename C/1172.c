#include <stdio.h>
int main()
{
    int N[10], i, j;
    for(i = 0; i < 10; i++)
        scanf("%d", &N[i]);
    for(i = 0; i < 10; i++)
    {
        if(N[i] <= 0) {
            N[i] = 1;
        }
    }
    for(i = 0; i < 10; i++) {
        printf("X[%d] = %d\n", i, N[i]);
    }
    return 0;
}