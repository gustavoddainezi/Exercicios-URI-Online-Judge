#include <stdio.h>
int main() {
    int qntd, h, m, porta, i;
    scanf("%d", &qntd);
    for(i = 0; i < qntd; i++){
        scanf("%d", &h);
        scanf("%d", &m);
        scanf("%d", &porta);
        if(porta == 1) {
            printf("%02d:%02d - A porta abriu!\n", h, m);
        }
        else {
            printf("%02d:%02d - A porta fechou!\n", h, m);				
        }
    }
    return 0;
}