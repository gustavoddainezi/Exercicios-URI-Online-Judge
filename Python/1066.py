# -*- coding: utf-8 -*-
ls = []
valPar = 0
valImpar = 0
valPo = 0
valNeg = 0
        
ls.append(int(input()))
ls.append(int(input()))
ls.append(int(input()))
ls.append(int(input()))
ls.append(int(input()))

for i in ls:
    if i % 2 == 0:
        valPar += 1
            
    else:
        valImpar += 1
            
    if i > 0:
        valPo += 1

    else:
        if i < 0:
            valNeg += 1
        
print(valPar, "valor(es) par(es)")
print(valImpar, "valor(es) impar(es)")
print(valPo, "valor(es) positivo(s)")
print(valNeg, "valor(es) negativo(s)")