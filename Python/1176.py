# -*- coding: utf-8 -*-
ls = [0, 1]
vAnt = 0
vAt = 1

for i in range(60):
    soma = vAt + vAnt
    ls.append(soma)
    vAnt = vAt
    vAt = soma

qntd = int(input())
for i in range(qntd):
    valor = int(input())
    print('Fib(%d) = %d' % (valor, ls[valor]))