# -*- coding: utf-8 -*-
qntd_tot = 0
qntd_r = 0
qntd_c = 0
qntd_s = 0

qntd = int(input())

for i in range(qntd):
    valores = input().split(" ")
    quantia, tipo = valores
    qntd_tot += int(quantia)
    
    if tipo == "C":
        qntd_c += int(quantia)

    elif tipo == "R":
        qntd_r += int(quantia)

    else:
        qntd_s += int(quantia)

print("Total: %d cobaias" % qntd_tot)
print("Total de coelhos: %d" % qntd_c)
print("Total de ratos: %d" % qntd_r)
print("Total de sapos: %d" % qntd_s)
print("Percentual de coelhos: {:.2f} %".format((qntd_c / float(qntd_tot)) * 100))
print("Percentual de ratos: {:.2f} %".format((qntd_r / float(qntd_tot)) * 100))
print("Percentual de sapos: {:.2f} %".format((qntd_s / float(qntd_tot)) * 100))