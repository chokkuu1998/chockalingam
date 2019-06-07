n,k=map(int,input().split())
a=[]
for i in range(n):
    d=set(map(int,input().split()))
    a.append(d)
c=d.intersection(*a)
print(*c)
