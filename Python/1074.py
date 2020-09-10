# -*- coding: utf-8 -*-
valor = int(input())

for i in range(valor):
    valor = int(input())
    if valor % 2 == 0:
        if valor == 0:
            print("NULL")
        if valor > 0:
            print("EVEN POSITIVE")
        elif valor < 0:
                print("EVEN NEGATIVE")
    else:
        if valor > 0:
            print("ODD POSITIVE")
        else:
            print("ODD NEGATIVE")