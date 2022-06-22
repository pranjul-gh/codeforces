x=int(input());c=0
while x!=0:
    if x>=1 and x<5:
        x-=1
        c+=1
    elif x<100 and x>=20:
        x-=20
        c+=1
    elif x<20 and x>=10:
        x-=10
        c+=1
    elif x<10 and x>=5:
        x-=5
        c+=1
    else:
        x-=100
        c+=1
print(c)
