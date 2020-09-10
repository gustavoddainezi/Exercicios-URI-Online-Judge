# -*- coding: utf-8 -*-
qntd = int(input())
cont = qntd
x = 1 / 6
aux = 1 / 6
if qntd == 0:
   print("%.10f" % (3))
else:
    while cont >= 2:
        aux = 1 / (6 + aux)
        cont -= 1
    print("%.10f" % (3 + aux))