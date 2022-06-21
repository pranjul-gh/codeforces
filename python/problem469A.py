n=int(input())
a = int(input())
l1=[]
l2=[]
for i in range(a):
    x = int(input())
    l1.append(x)
b = int(input())
for j in range(b):
    y=int(input())
    l2.append(y)

l2.extend(l1)
count=0

for i in range(0,len(l2)):
    if l2[i]==n:
        count+=1
    else:
        continue
if count>=1:
    print("I become the guy.")
else:
    print("Oh, my keyboard!")
     