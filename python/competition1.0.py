'''=======FAILED====='''
'''
t=int(input())
for i in range(t):
    a1=input().split(" ")
    m=int(a1[1])
    arr=list(input().split(" "))
    print(arr)
    stt=str(arr)+" "
    #print(type(arr[0]))     #class str
    s="B" * m
    ls=list(s)
   # print(ls)
    for p in range(len(arr)):
        x=int(arr[p])
        c=0
       # print(x)
        if (x < (m+1)-x) and str(x) not in stt[x+1:]:
            ls[p]="A"
            # kp=(m+1)-x
            # print(kp)
            # ls[kp-1]="A"
        if (x < (m+1)-x) and str(x) in stt[x+1:] and c==0:
            ls[p]='A'
            # kp=(m+1)-x
            # print(kp)
            # ls[kp-1]="A"
        if x > (m+1)-x:
            kp=(m+1)-x
            ls[kp]="A"
        else:
            continue
    print(ls)   
    '''

# t=int(input())
# for loop in range(t):
#     l=int(input())
#     lst=list(input())

#     lst0 = lst.copy()
#     lst1 = lst.copy()
#     lst2 = lst.copy()    

#     l0=int((l/2))    
#     l1=int((l/2)+1)
#     l2=int((l/2)-1)

#     lst0.pop(l0)
#   #  print(lst0)
#   #  print("rev",lst0[-1::-1])
#     lst1.pop(l1)
#     lst2.pop(l2)
#     if lst0==lst0[-1::-1]:
#         print(l0)
#         break
#     elif lst1==lst1[-1::-1]:
#         print(l1)
#         break
#     elif lst2==lst2[-1::-1]:
#         print(l2)
#         break 

