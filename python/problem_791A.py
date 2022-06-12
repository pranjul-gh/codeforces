x=input().split(' ')
a=int(x[0])
b=int(x[1])

for i in range(1,11):
    a*=3
    b*=2
    if (a>b):
        break

print(i)


