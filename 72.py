def quasipalindome():
	n=input()
	l=list(n)

	r=[]
	rr=[]
	f=0
	for i in l:
		j=int(i)
		if j==0:
			continue
		r.append(j)
	for i in range(len(r)-1,-1,-1):
		rr.append(r[i])
	for i in range(len(r)):
		if r[i]==rr[i]:
			continue
		else:
			f=1
			break
	if f!=1:
		print('yes')
	else :
		print('no')
   
try:
    quasipalindome()
 except:
    print('invalid')
