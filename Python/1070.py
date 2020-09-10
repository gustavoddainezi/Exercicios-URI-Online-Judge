# -*- coding: utf-8 -*-
n = int(input())
qntd = 0

while True:
    if(n % 2 != 0):
        qntd += 1
        print(n)
    n += 1
    if(qntd == 6):
        break