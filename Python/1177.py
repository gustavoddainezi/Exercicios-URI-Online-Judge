# -*- coding: utf-8 -*-
cont = 0
val = int(input())

for i in range(0, 1000):
    print("N[%i] = %i" % (i, cont))
    cont += 1
    if(cont == (val)):
        cont = 0