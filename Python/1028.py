# -*- coding: utf-8 -*-
n = int(input())
while n > 0:
    f1, f2 = map(int, input().split())
    def mdc(a, b):
        if b == 0:
            return a
        return mdc(b, a % b)
    print(mdc(f1, f2))
    n -= 1