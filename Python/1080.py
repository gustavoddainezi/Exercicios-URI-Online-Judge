# -*- coding: utf-8 -*-
maior = 0
ls = {}
posicao = 0

while posicao < 100:
    valor = int(input())
    if valor > maior:
        maior = valor
        ls[valor] = posicao
    posicao += 1
print(maior)
print(ls [maior] + 1)