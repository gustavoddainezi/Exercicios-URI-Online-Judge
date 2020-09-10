# -*- coding: utf-8 -*-
alcool = 0
gasolina = 0
diesel = 0

while True:
    v = int(input())
    
    if v == 1:
        alcool += 1 
    elif v == 2:
        gasolina += 1
    elif v == 3:
        diesel += 1 
    elif v == 4:
        break
    
print("MUITO OBRIGADO")
print("Alcool:", alcool)
print("Gasolina:", gasolina)
print("Diesel:", diesel)