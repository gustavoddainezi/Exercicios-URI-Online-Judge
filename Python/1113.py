# -*- coding: utf-8 -*-
while True:
    x, y = input().split()
    x = int(x)
    y = int(y)

    if(x > y):
        print("Decrescente")
    elif x < y:
        print("Crescente")
    elif(x == y):
        break