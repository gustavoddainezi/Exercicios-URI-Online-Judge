#include <stdio.h>
int main() {
    char frase[600];
    gets(frase);
    if(strlen(frase) > 80) {
        printf("NO\n");
    }
    else {
        printf("YES\n");
    }
    return 0;
}