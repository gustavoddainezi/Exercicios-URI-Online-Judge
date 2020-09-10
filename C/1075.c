#include <stdio.h>
int main()
{
    int n, i;
    scanf("%d", &n);
    for(i = 2; i <= 10000; i += n) {
        printf ("%d\n", i);
    }
    return 0;
}