t=int(input())
lst=[]
for j in range(12000):
    if j%3!=0:
        lst.append(j)
for T in range(t):
    x=int(input())
    print(lst[x-1])

