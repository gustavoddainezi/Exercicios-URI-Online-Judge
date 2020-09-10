# -*- coding: utf-8 -*-
n1 = 'I'
n2 = 0
soma = 0

ls = list(map(int,input().split(" ")))
for i in ls:
    if n1 == 'I':
        n1 = i
    elif i > 0:
            n2 = i
            break

for i in range(n2):
    soma += n1
    n1 += 1
    
print("%d" % soma)