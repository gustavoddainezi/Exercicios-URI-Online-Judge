# -*- coding: utf-8 -*-
sal = float(input())
imp = 0

if sal > 4500:
    imp = 1000 * 0.08 + 1500 * 0.18
    dif = sal - 4500
    imp += dif * 0.28

elif sal > 3000:
    imp = 1000 * 0.08
    dif = sal - 3000
    imp += dif * 0.18

elif sal > 2000:
    dif = sal - 2000
    imp = dif * 0.08

if imp > 0:
    print("R$ %.2f" % imp)

else:
   print("Isento")