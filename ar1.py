nn=int(input())
ll1=[int(x) for x in input().split()]
ll2=[]
for i in range(len(l1)-1):
	l=ll1[i+1::]
	m=max(l)
	ll2.append(m)
ll2.append(0)
print(*ll2)
