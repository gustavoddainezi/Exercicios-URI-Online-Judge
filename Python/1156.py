# -*- coding: utf-8 -*-
soma = 1
cont1 = 2
cont2 = 3
while cont2 < 40:
    soma += float(cont2) / float(cont1)
    cont1 *= 2
    cont2 += 2

print("%.2f" % soma)