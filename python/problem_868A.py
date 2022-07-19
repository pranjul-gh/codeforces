str0 = input()
t=int(input())
str1=''
str2=''
flagi=0
f=0
flagj=0
for i in range(t):
    x=input()
    if x==str0:
        f=2
        break
    if str0[0]==x[1]:
        flagi=1
    if str0[1]==x[0]:
        flagj=1

if (flagi+flagj)>1 or f==2:
    print("YES")
else:
    print("NO")