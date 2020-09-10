# -*- coding: utf-8 -*-
a, b, c = input().split(" ")
a = float(a)
b = float(b)
c = float(c)
        
if b > a:
    aux = a
    a = b
    b = aux

if c > a:
    aux = a
    a = c
    c = aux
        
a2 = pow(a, 2)
bMc2 = pow(b, 2) + pow(c, 2)
        
if a >= b + c:
    print("NAO FORMA TRIANGULO")

else:
    if a2 > bMc2:
        print("TRIANGULO OBTUSANGULO")

    elif a2 < bMc2: 
        print("TRIANGULO ACUTANGULO")

    else:
        print("TRIANGULO RETANGULO")


    if a == b and b == c:
        print("TRIANGULO EQUILATERO")

    elif a == b or a == c or b == c:
        print("TRIANGULO ISOSCELES")