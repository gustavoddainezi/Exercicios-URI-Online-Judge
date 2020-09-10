# -*- coding: utf-8 -*-
qntd = int(input())

for i in range(qntd):
    valores = list(map(int,input().split(" ")))
    hInicio, hFim, abfc = valores

    if abfc == 1:
        porta = "abriu!"
    else:
        porta = "fechou!"
    
    print("%02d:%02d - A porta %s" % (hInicio, hFim, porta))