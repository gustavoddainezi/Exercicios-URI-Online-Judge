# -*- coding: utf-8 -*-
lista = [ ]
somaPar = 0

lista.append(float(input()))
lista.append(float(input()))
lista.append(float(input()))
lista.append(float(input()))
lista.append(float(input()))

for p in lista:
    if p % 2 == 0:
        somaPar += 1

print(somaPar, "valores pares")