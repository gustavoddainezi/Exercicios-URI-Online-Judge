# -*- coding: utf-8 -*-
lista = [ ]
positivo = 0

lista.append(float(input()))
lista.append(float(input()))
lista.append(float(input()))
lista.append(float(input()))
lista.append(float(input()))
lista.append(float(input()))

for n in lista:
    if n > 0:
        positivo += 1

print(positivo, "valores positivos")