# -*- coding: utf-8 -*-
import math

a, b, c = input().split(" ")

a = float(a)
b = float(b)
c = float(c)
delta = pow(b, 2) - (4 * a * c)

if a == 0 or delta <= 0:
    print("Impossivel calcular")

else:
    r1 = (- b + math.sqrt(delta)) / (2 * a)
    r2 = (- b - math.sqrt(delta)) / (2 * a)
    print("R1 = %.5f" % r1)
    print("R2 = %.5f" % r2)