c=0
m=0
n=int(input())
for t in range(n):
    x=input().split(' ')
    a=x[0]
    b=x[1]
    if a>b:
        m+=1
    if a<b:
        c+=1
    else:
        m+=1
        c+=1
if m>c:
    print('Mishka')
elif m<c:
    print('Chris')
elif m==c:
    print("Friendship is magic!^^")