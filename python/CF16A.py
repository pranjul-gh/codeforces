nm=input().split(' ')
n=int(nm[0])
# flag1=1
flag2=0
l=[]
for i in range(n):
    x=input()
    y=set(x)
    if len(y)==1:
        #flag1=10
        l.append(x)
    else:continue
for j in range(len(l)-2):
    if(l[j]==l[j+1] or l[j+1]==l[j+2]):
        flag2=10
if n!=len(l) or flag2==10:
    print("NO")
else:print("YES")
