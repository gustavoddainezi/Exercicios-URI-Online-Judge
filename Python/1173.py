# -*- coding: utf-8 -*-
val = int(input())
print("N[%d] = %d" % (0, val))
for i in range(1, 10):    
    val *= 2
    print("N[%d] = %d" % (i, val))