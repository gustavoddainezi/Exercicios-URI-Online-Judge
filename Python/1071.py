# -*- coding: utf-8 -*-
x = int(input())
y = int(input())

tot = 0

if(x > y):
    t = x
    x = y
    y = t

if(x % 2 != 0):
    x += 2
    while(x < y):
        if x % 2 != 0:
            tot += x
        x += 1
else:
    x += 1
    while(x < y):
        if x % 2 != 0:
            tot += x
        x += 1

print(tot)