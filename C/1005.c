#include <stdio.h>
int main() {
    double x, y, media;
    scanf("%lf", &x);
    scanf("%lf", &y);
    media = (x * 3.5 + y * 7.5) / (3.5 + 7.5);
    printf("MEDIA = %.5lf\n", media);
    return 0;
}