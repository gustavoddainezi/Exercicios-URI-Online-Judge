# -*- coding: utf-8 -*-
hInicio, hFim = input().split(" ")

hInicio = int(hInicio)
hFim = int(hFim)

        
if hInicio > hFim:
    tempo = 24 + hFim - hInicio
elif hFim > hInicio:
    tempo = hFim - hInicio
else:
    tempo = 24

print("O JOGO DUROU" , tempo , "HORA(S)")