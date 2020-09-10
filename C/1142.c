#include <stdio.h>
 
int main() {
    int N, a, b, c = 1,d = 4;
    scanf("%d", & N);
    for(a = 1; a <= N; a++)
    {
        for(b = c; b <= d; b++)
        {
            if(b % 4 == 0)
                printf("PUM\n");
            else
                printf ("%d ", b);
        }
        c += 4; d += 4;
    }
    return 0;
}