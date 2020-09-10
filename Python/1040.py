# -*- coding: utf-8 -*-
valores = input().split()
n1, n2, n3, n4 = valores

n1 = float(n1)
n2 = float(n2)
n3 = float(n3)
n4 = float(n4)

nExame = 0.0
media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10

print('Media: %.1f' % media)

if media >= 7.0:
    print("Aluno aprovado.")

if media < 5.0:
    print("Aluno reprovado.")

if media >= 5.0 and media <= 6.9:
    print("Aluno em exame.")
    nExame = float(input())
    print("Nota do exame: %.1f" % nExame)
    media = (media + nExame) / 2
    
    if media >= 5.0:
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print('Media final: %.1f' % media)