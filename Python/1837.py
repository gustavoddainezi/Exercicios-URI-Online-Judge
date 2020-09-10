# -*- coding: utf-8 -*-
a, b = list(map(int,input().split(" ")))
div = divmod(a, abs(b)) 
if b < 0: 
    print(- div[0], div[1]) 
else: 
    print(div[0], div[1])