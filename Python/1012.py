# -*- coding: utf-8 -*-
a, b, c = input().split(" ")
a = float(a)
b = float(b)
c = float(c)
triang = (a * c) / 2
circ = (3.14159 * pow(c, 2))
trap = ((a + b) / 2) * c
quad = b * b
ret = b * a
        
print("TRIANGULO: %.3f" % triang)
print("CIRCULO: %.3f" % circ)
print("TRAPEZIO: %.3f" % trap)
print("QUADRADO: %.3f" % quad)
print("RETANGULO: %.3f" % ret)