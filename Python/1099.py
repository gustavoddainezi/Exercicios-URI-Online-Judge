# -*- coding: utf-8 -*-
qntd = int(input())

for i in range(qntd):
    n1, n2 = list(map(int,input().split(" ")))
    somaImpar = 0
    
    if n1 == n2:
        print(0)
    else:
        tmp = 0
        if n1 > n2:
            tmp = n1
            n1 = n2
            n2 = tmp

        while n1 < (n2 - 1):
            n1 += 1
            
            if n1 % 2 != 0:
                somaImpar += n1
                
        print(somaImpar)