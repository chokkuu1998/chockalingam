f=int(input())
g=list(map(int,input().split()))
g.sort()
list=[]
for j in range(0,f-2):
    if g[i]==g[j+2]:
        li.append(g[i])
for j in g:
    if j not in li:
        print(j)
