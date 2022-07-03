t=int(input())
lst=[]

for i in range(t):

    s=list(input())
    st=""
   # print(s)
    for l in range(1,len(s)-1):
        if l%2==0:
          
           st+=s[l]
        # else:
        #     continue
    y=s[0]+st+s[len(s)-1]
    lst.append(y)
for j in  range(t):

    print(lst[j])

