# -*- coding: utf-8 -*-
a, b, c, d = input().split()
a = int(a)
b = int(b)
c = int(c)
d = int(d)

hInicio = a * 60 + b
hFinal = c * 60 + d

if a <= c:
    duracao = hFinal - hInicio
    if duracao == 0:
        print("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" % (24, duracao % 60))
    else:
        print("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" % ((duracao - duracao % 60) / 60, duracao % 60))
else:
    duracao = (24 * 60 - hInicio) + hFinal
    print("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" % ((duracao - duracao % 60) / 60, duracao % 60))