# -*- coding: utf-8 -*-
qntd = int(input())

for i in range(qntd):
	nome, forc = input().split(" ")
	forc = int(forc)

	if nome != "Thor":
		print("N")
	else:
		print("Y")