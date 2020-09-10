# -*- coding: utf-8 -*-
cont = 0
somaNotas = 0 

while cont < 2:
    nota = float(input())
    if nota > 10 or nota < 0:
        print("nota invalida")
    else:
        cont += 1
        somaNotas += nota

print("media = %.2f" % (somaNotas / 2))