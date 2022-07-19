
x=list(input())
y=x.count('a')
l=len(x)
if (y<int(l/2)) or (y<int((l/2)+1)):
    print((y+y)-1)
else:
    print(l)