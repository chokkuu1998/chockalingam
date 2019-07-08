pp=int(input())
qq=list(map(int,input().split()))
c=2
for i in qq:
    if qq.count(i)>c:
        r=i
        c=qq.count(i)
print(r)
