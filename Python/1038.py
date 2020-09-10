# -*- coding: utf-8 -*-
cod, qntd = input().split(" ")

cod = int(cod)
qntd = int(qntd)
        
if cod == 1:
    tot = qntd * 4.00
    print("Total: R$ %.2f" % tot)

elif cod == 2:
    tot = qntd * 4.50
    print("Total: R$ %.2f" % tot)

elif cod == 3:
    tot = qntd * 5.00
    print("Total: R$ %.2f" % tot)

elif cod == 4:
    tot = qntd * 2.00
    print("Total: R$ %.2f" % tot)

elif cod == 5:
    tot = qntd * 1.50
    print("Total: R$ %.2f" % tot)