# -*- coding: utf-8 -*-
qntd = int(input())

for i in range(qntd):
    valores = list(map(int,input().split(" ")))
    n1, n2 = valores
    if n2 != 0:
        print(n1 / n2)
    else:
        print("divisao impossivel")