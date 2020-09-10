# -*- coding: utf-8 -*-
senha = 2002

while True:
	teste = int(input())
	if teste != senha:
		print("Senha Invalida")
	elif teste == senha:
		print("Acesso Permitido")
		break