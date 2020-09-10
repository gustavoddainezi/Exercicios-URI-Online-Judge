#include <stdio.h>
int main()
{
    int x, a, som = 0;
    while(1)
    {
        scanf("%d", &x);
        som = 0;
        if(x == 0)
        {
            break;
        }
        else if(x % 2 == 0)
        {
            for(a = x; a <= x + 8; a += 2) 
            {
                som += a;
            }
        }
        else
        {
            for(a = x + 1; a <= x + 9; a += 2) 
            {
                som += a;
            }
        }
        printf("%d\n", som);
    }
    return 0;
}