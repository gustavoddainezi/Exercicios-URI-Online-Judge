#include <stdio.h>
int main()
{
    int val, i, c, d;
    char frase[40] = "LIFE IS NOT A PROBLEM TO BE SOLVED";
    scanf("%d", &val);
    for(i = 0; i < val; i++) {
        printf("%c", frase[i]);
    }
    printf("\n");
    return 0;
}