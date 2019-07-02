n,k=map(int,input().split())
lis=[int(i) for i in input().split()]
c=0
for i in range(n):
	for j in range(i+1,n):
		if abs(lis[i]-lis[j])==k:
			c+=1
print(c)
