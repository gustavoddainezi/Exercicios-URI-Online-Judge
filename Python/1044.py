# -*- coding: utf-8 -*-
n1, n2 = input().split(" ")
n1 = int(n1)
n2 = int(n2)

if n2 % n1 == 0 or n1 % n2 == 0:
    print("Sao Multiplos")

else:
    print("Nao sao Multiplos")