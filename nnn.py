m=int(input())
l=[int(x) for x in input().split()]
n=1000
for i in range(0,len(l)-1):
    for j in range(i+1,len(l)):
        if abs(l[i]+l[j])<n:
            n=abs(l[i]+l[j])
            u,v=l[i],l[j]
print(u,v)
