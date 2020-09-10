# -*- coding: utf-8 -*-
sal = float(input())

if(sal <= 400):
    print("Novo salario: %.2f" % (sal * 1.15))
    print("Reajuste ganho: %.2f" % (sal * 0.15))
    print("Em percentual: 15 %")
    
if(sal > 400 and sal <= 800):
    print("Novo salario: %.2f" % (sal * 1.12))
    print("Reajuste ganho: %.2f" % (sal * 0.12))
    print("Em percentual: 12 %")
    
if(sal > 800 and sal <= 1200):
    print("Novo salario: %.2f" % (sal * 1.10))
    print("Reajuste ganho: %.2f" % (sal * 0.10))
    print("Em percentual: 10 %")

if(sal > 1200 and sal <= 2000):
    print("Novo salario: %.2f" % (sal * 1.07))
    print("Reajuste ganho: %.2f" % (sal * 0.07))
    print("Em percentual: 7 %")

if(sal > 2000):
    print("Novo salario: %.2f" % (sal * 1.04))
    print("Reajuste ganho: %.2f" % (sal * 0.04))
    print("Em percentual: 4 %")