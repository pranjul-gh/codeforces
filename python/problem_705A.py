n = int(input())
a="I hate"
b="it"
c="I love"
d="that"

for i in range(1,n+1):
    if i == 1 and n==1:
        print("I hate it",end=' ')
    elif i==1 and  n!=1:
         print("I hate that",end=' ')
    else:
       
        if i%2 == 0 and i<n:
            print(c+" "+d,end=' ')
        elif i%2 != 0 and i<n:
            print(a+" "+d,end=' ')
        elif i==n and i%2 == 0:
            print(c+" "+b)
        elif i==n and i%2 != 0:
            print(a+" "+b)

