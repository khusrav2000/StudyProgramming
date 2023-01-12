f = open("text.txt" , "r")
for i in f:

	
	h = list(map(int , i.split()));
	print(h[0] , "->" , h[1] , ": " , end = '')
	for j in range(2 , 7):
		d = h[j]
		p = 1
		s = 0
		while d > 0:
			s = s + (d % 10) * p
			d = d // 10
			p = p * (h[0])
		g = ['A' , 'B' , 'C' , 'D' , 'E' , 'F']
		ans = ""
		s = -s if s < 0 else s
		while s > 0:
			q = s % h[1]
			if q <= 9:
				ans += str(q);
			else:
				ans += g[q - 10]
			s = s // h[1]
		ans = ans[::-1]
		print(h[j] , "->" , ans , "| " if j < 6 else "" , end = '')
	print('\n')