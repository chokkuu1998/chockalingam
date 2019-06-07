n,k=map(int,input().split())
d=[]
for i in range(n):
	s1=set(map(int,input().split()))
	d.append(s1)
c=s1.intersection(*d)
print(*c)
