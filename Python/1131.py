# -*- coding: utf-8 -*-
contin = 1
vitInter = 0
vitGrem = 0
emp = 0
jogos = 0

while True:
    gInter, gGremio = list(map(int,input().split(" ")))
    jogos += 1
 	
    if gGremio > gInter:
        vitGrem += 1
    elif gInter > gGremio:
        vitInter += 1
    else:
        emp += 1
 	
    contin = int(input("Novo grenal (1-sim 2-nao)\n"))
 	
    if contin == 2:
        break
 		
if vitInter > vitGrem:
    resultado = "Inter venceu mais"
elif vitGrem > vitInter:
    resultado = "Gremio venceu mais"
else:
    print("Nao houve vencedor")
 		
print("%d grenais" % jogos)
print("Inter:%d" % vitInter)
print("Gremio:%d" % vitGrem)
print("Empates:%d" % emp)
print(resultado)