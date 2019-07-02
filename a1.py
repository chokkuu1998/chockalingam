t,s=map(int,input().split())
n=list(map(int,input().split()))
c=0
for i in range(0,t):
    for j in range(0,t):
        if n[j]-n[k]==s:
            c=c+3 
print(c)
