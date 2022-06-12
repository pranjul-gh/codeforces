ucount = 0
lcount = 0
s = input("s")
for i in s:
    if i.isupper() == True:
        ucount+=1
    else:
        lcount+=1

if ucount > lcount:
    print(s.upper())
else:
    print(s.lower())
