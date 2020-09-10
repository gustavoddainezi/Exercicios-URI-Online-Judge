#include <stdio.h>
int main()
{
    double i, b = 1, c, soma = 0;
    for(i = 1; i < 101; i++)
    {
        c = 1 / i;
        soma += c;
    }
    printf("%.2lf\n", soma);
    return 0;
}