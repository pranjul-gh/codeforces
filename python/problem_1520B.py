
t=int(input())
lst=[]
for j in range(t):
    n=int(input())
    count = 0
    for i in range(1,n+1):
        l=len(set(str(i)))
        if l==1:
            count+=1

    lst.append(count)            
#print(lst)
for k in range(len(lst)):
    print(lst[k])
