# -*- coding: utf-8 -*-
qntd = int(input())
for i in range(qntd):
    palavra = input()
    t = 0.00
    for j in range(len(palavra)):
        t += 0.01
    print("%.2f" % t)