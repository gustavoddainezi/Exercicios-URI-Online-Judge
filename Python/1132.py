# -*- coding: utf-8 -*-
x = int(input())
y = int(input())
cont = x
soma = 0

if x > y:
    x = y
    y = cont

while(x <= y):
    if x % 13 != 0:
        soma += x
    x += 1

print(soma)