# -*- coding: utf-8 -*-
a, b, c, d = list(map(int,input().split(" ")))

if ((a < (b + c)) and (a > abs(b - c))
or (a < (b + d)) and (a > abs(b - d))
or (a < (c + d)) and (a > abs(c - d))
or (b < (a + c)) and (b > abs(a - c))
or (b < (a + d)) and (b > abs(a - d))
or (b < (c + d)) and (b > abs(c - d))
or (c < (a + b)) and (c > abs(a - b))
or (c < (a + d)) and (c > abs(a - d))
or (c < (b + d)) and (c > abs(b - d))
or (d < (a + b)) and (d > abs(a - b))
or (d < (a + c)) and (d > abs(a - c))
or (d < (b + c)) and (d > abs(b - c))):
    print("S")
else:
    print("N")