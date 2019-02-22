def army():
	n=int(input())
	x=int(input())
	y=int(input())
	z=int(input())
	if n==x+y+z:
		print('none')
	elif n==x+y:
		print(z)
	elif n==y+x:
		print(y)
	elif n==y+z :
		print(x)
	else :
		print('none')
try:
    	army()
except:
    	print('invalid')
