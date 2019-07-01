    
import sys,string, itertools
n = int(input())
L = [ int(x) for x in input().split()]
n,k = input().split()
n,k = int(n),int(k)
min1 = len(L)
while n in L and k in L :
    i1 = L.index(n)
    i2 = L.index(k)
    gap = abs(i1-i2)
    if gap < min1 :
        min1 = gap
    if i1 < i2 :
        L.pop(i1)
    else :
        L.pop(i2)

print(min1)
© 2019 GitHub, Inc.
