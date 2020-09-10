# -*- coding: utf-8 -*-
import math
n = float(input())

fi = (pow(((1 + math.sqrt(5)) / 2), n) - pow(((1 - math.sqrt(5)) / 2), n)) / math.sqrt(5)

print("%.1f" % fi)