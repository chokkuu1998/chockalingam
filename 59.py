n=int(input("enter no"))
l=[]
c=0
for i in range(n):
    a=int(input())
    l.append(a)
for i in range(n):
    if i==n-1:
        break
    if l[i]>l[i+1]:
        if i==n-2:
            break
        if l[i+1]<l[i+2]:
            c=c+1
    elif l[i]<l[i+1]:
        if i==n-2:
            break
        if l[i+1]>l[i+2]:
            c=c+1
    else:
        pass
print(c)
      
