# -*- coding: utf-8 -*-
val = int(input())
nIn = 0
nOut = 0

for i in range(val):
    valor = int(input())
    if valor >= 10 and valor <= 20:
        nIn += 1
    else:
        nOut += 1

print("%d in" % nIn)
print("%d out" % nOut)