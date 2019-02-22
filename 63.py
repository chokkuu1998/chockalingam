def card():
	o=int(input())
	z=int(input())
	n=o-z
	if n>=3 or (-n)>=3:
		print(-1)
		return
	l=['0','1']
	s=''
	for i in range(0,o+z,2):
		s+=l[1]
		if i==(o+z)-1 and i%2!=1:
			break
		s+=l[0]
	print(s)
try:
	card()
except:
    	print('invalid')
