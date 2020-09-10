#include<stdio.h>
int main()
{
   long long int n, vAnt = 0, vAt = 1, prox, c;
   int i, j;

   scanf("%d", &j);

   for(i = 1; i <= j; i++, vAnt = 0, vAt = 1) {
       scanf("%lld", &n);
       n = n + 1;
       for (c = 0; c < n; c++) {
          if (c <= 1) {
            prox = c;
          }
          else
          {
             prox = vAnt + vAt;
             vAnt = vAt;
             vAt = prox;
          }
       }
          printf("Fib(%lld) = %lld\n", n - 1, prox);
   }
   return 0;
}