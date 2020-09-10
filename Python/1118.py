# -*- coding: utf-8 -*-
while True:
    soma = 0
    cont = 0
    while cont < 2:
        nota = float(input())
        if nota >= 0 and nota <= 10:
            soma += nota
            cont += 1
        else:
            print("nota invalida")
    print("media = %.2f" % (soma / 2))
    
    verif = 0
    while True:
        print("novo calculo (1-sim 2-nao)")
        verif = int(input())
        if verif == 1 or verif == 2:
            break
    
    if verif == 2:
        break