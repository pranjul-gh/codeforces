s = input()

c1 = s.count('4')
c2 = s.count('7')
#print(type(s))         #str
#print(type(c1))        #int
#print(c1,'--',c2)
add = c1+c2
if add == 4 or add == 7:
    print("YES")
else:
    print("NO")
 


