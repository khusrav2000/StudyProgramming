inp = open("input.json", "r")
out = open("output.proto", "w")
kolsc = 0 
count = 0 
for line in inp: 
	line = line.strip()
	if ':' in line: 
		a = line.split(':')
		part1 = a[0]
		part2 = a[1]
		part1 = part1.strip('"')
		if '{' in line:
			kolsc = kolsc + 1
			out.write('message ' + part1 + ' {\n') 
		else:
			out.write(' required string ' + part1 + ' = ' + str(count) + ';\n') 
			count = count + 1
	elif '}' in line and kolsc == 1:
		out.write('}\n')
		kolsc = kolsc - 1 
		count = 0 
inp.close() 
out.close()