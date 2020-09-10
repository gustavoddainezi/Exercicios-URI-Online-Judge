#include <stdio.h>
int main()
{
    int a, b, c, d, e, f, q, r;
    scanf("%d%d", &a, &b);
    if(a < 0)
    {
        e = b;
        if(b < 0) {
            e = b * (-1);
        }
        for(r = 0; r < e; r++)
        {
            f = a - r;
            if(f % b == 0) {
                break;
            }
        }
        q = f / b;
    }
    else
    {
        q = a / b;
        r = a % b;
    }
    printf("%d %d\n",q,r);
    return 0;
}