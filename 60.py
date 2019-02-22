import sys, string, math

n,k = input().split()
n,k = int(n),int(k)
L = [ int(x) for x in input().split()]
L.sort()
cnt = 0
a = n // 3
#print(a)
for i in range(0,a) :
    L2 = L[3*i : 3*(i+1)]
    #print(L2)
    if 5-max(L2) >= k :
        cnt += 1
print(cnt)
