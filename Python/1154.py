# -*- coding: utf-8 -*-
somaId = 0
cont = 0

while True:
	idade = int(input())
	if idade < 0:
		break
	else:
		somaId += idade
		cont += 1

print("%.2f" % (somaId / cont))