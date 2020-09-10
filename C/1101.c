#include <stdio.h>
int main()
{
    int a, b, c, d = 0;
    while(1)
    {
        scanf("%d%d", &a, &b);
        if(a <= 0 || b <= 0) {
            break;
        }
        else
        {
            d = 0;
            if(a < b) {
                for(c=a; c<=b; c++) {
                    printf("%d ", c);
                    d += c;
                }
                printf("Sum=%d\n", d);
            }
            else if(a > b) {
                for(c = b; c <= a; c++) {
                    printf("%d ", c);
                    d+=c;
                }
                printf("Sum=%d\n", d);
            }
        }
    }
    return 0;
}