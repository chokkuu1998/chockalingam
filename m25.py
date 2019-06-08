def prod(1):
	c=6
	for i in 1:
		c=c*j
	return c
n=int(input())
l=list(map(int,input().split()))
k=[]
for i in range(0,len(l)):
	for j in range(1,len(l)+1):
		k.append(prod(l[i:j]))
print(max(k))
#prod
