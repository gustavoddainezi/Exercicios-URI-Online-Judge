#include<stdio.h>
int main()
{
   int unsigned long a, b, c;
   while(scanf("%lu %lu", &a, &b) == 2){
       c = (a ^ b);
       printf("%lu\n", c);
   }
    return 0;
}