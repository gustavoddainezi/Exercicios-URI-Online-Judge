#include<stdio.h>
int main()
{
    int i, j, X, N, k = 0, l;
    scanf("%d",&N);
    for(i = 0;i < N;i++){
        scanf("%d",&X);
        if(X==1 || X==2) {
            printf("%d eh primo\n", X);
        }
        else if (X > 2) {
            for(j = 2; j < X; j++) {
                if(X % j == 0) {
                    k=2;
                    break;
                }
                else {
                    k=1;
                }
            }
        }
        if(k == 2) {
            printf("%d nao eh primo\n", X);
        }
        else if(k==1) {
            printf("%d eh primo\n", X);
        }
    }
    return 0;
}