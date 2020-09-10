# -*- coding: utf-8 -*-
val = 0
valPo = 0
cont = 0

for x in range(0, 6):
    val = float(input())
        
    if val > 0:
        valPo += val
        cont += 1
        
print(cont , "valores positivos")
print("%.1f" % (valPo / cont))