# -*- coding: utf-8 -*-
ls = []
mDois = 0
mTres = 0
mQuatro = 0
mCinco = 0

qntd = int(input())

ls = list(map(int,input().split(" ")))

for i in range(qntd):
	if ls[i] % 2 == 0:
		mDois += 1
	if ls[i] % 3 == 0:
		mTres += 1
	if ls[i] % 4 == 0:
		mQuatro += 1
	if ls[i] % 5 == 0:
		mCinco += 1

print("%d Multiplo(s) de 2" % mDois)
print("%d Multiplo(s) de 3" % mTres)
print("%d Multiplo(s) de 4" % mQuatro)
print("%d Multiplo(s) de 5" % mCinco)