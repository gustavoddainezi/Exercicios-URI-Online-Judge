# -*- coding: utf-8 -*-
v = []

while True:
    v.append(int(input()))
    if v[-1] == 0:
        v.pop()
        break
        
for i in range(len(v)):
    for x in range(1, v[i]):
        print(x, end = " ")
    print(v[i])