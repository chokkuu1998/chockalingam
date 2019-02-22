def anagram():
	n1=input()
	n2=input()
	l=list(n1)
	m=list(n1)
	f=0
	if len(l)==len(m):
		for i in range(len(l)):
			if l[i]==m[i]:
				f=1
				continue
			else:
				break
	else:
		f=0
	if f==1:
		print('yes')
	else :
		print('no')
try:
	anagram()
except:
    	print('invalid')
