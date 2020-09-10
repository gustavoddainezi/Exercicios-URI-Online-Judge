# -*- coding: utf-8 -*-
v = int(input())

for i in range(v):
    ls = list(map(float,input().split()))
    n1, n2, n3 = ls
    n1 = n1*2
    n2 = n2*3
    n3 = n3*5
    media = (n1 + n2 + n3) / 10
    print("%.1f" % media)