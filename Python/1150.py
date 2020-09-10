# -*- coding: utf-8 -*-
n1 = int(input())
while True:
    n2 = int(input())
    if n2 > n1:
        break
soma = n1
qntd = 1
while soma < n2:
    soma += n1 + qntd
    qntd += 1
print(qntd)