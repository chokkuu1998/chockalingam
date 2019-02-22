def max3():
    n = int(input())
    p = int(input())
    q = int(input())
    r = int(input())
    l = []
    max = -1
    for i in range(n):
        l.append(int(input()))
    l.sort()
    for i in range(n):
        for j in range(n):
            for k in range(n):
                sum = (p * l[i]) + (q * l[j]) + (r * l[k])
            if max < sum:
                max = sum
    print(sum)


try:
    max3()
except:
    print('invalid')
