''' 
t=int(input())
lst=[]
for i in range(t):
    n=int(input())
    x=input().split(' ')
    for k in range(0,n-2):
        # if (x[k-1]==x[k]):
        #     continue
        if (x[k]!=x[k+1] and x[k+1]!=x[k+2]):
            lst.append(k)
            break
        # else:
        #     lst.append(k+1)
        #     break
print(lst)
for l in range(t):
    print(lst[l])
'''

'''
t=int(input())
lst=[]
for i in range(t):
    n=int(input())
    x=input().split(' ')
    y=list(set(x))

    m1=x.count(y[0])
    m2=x.count(y[1])

    i1=y[0]
    i2=y[1]

    if m1==1:
        indx=x.index(i1)
        lst.append(indx)

    elif m2==1:
        indx=x.index(i2)    
        lst.append(indx)

for k in range(0,t):
    print(lst[k]+1)
 '''   


t=int(input())
lst=[]
for i in range(t):
    n=int(input())
    x=input().split(' ')
    y=tuple(x)
    x.sort()
    if x[0]==x[1]:
        m1=x[n-1]
    else:
        m1=x[0]
    idx=y.index(m1)
    lst.append(idx)

for i in range(t):
    print(int(lst[i])+1)
