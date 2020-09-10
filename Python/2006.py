# -*- coding: utf-8 -*-
tipocha = int(input())
a, b, c, d, e = list(map(int,input().split()))
certos = 0
		
if a == tipocha:
	certos += 1
if b == tipocha:
	certos += 1
if c == tipocha:
	certos += 1
if d == tipocha:
	certos += 1
if e == tipocha:
	certos += 1
		
print(certos);