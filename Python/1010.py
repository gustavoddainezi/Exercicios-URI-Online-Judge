# -*- coding: utf-8 -*-
prod1, qntd1, preco1 = input().split(" ")
prod2, qntd2, preco2 = input().split(" ")

prod1 = int(prod1)
qntd1 = int(qntd1)
preco1 = float(preco1)

prod2 = int(prod2)
qntd2 = int(qntd2)
preco2 = float(preco2)

tot = (qntd1 * preco1) + (qntd2 * preco2)
        
print("VALOR A PAGAR: R$ %.2f" % tot)