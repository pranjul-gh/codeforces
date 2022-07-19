t=int(input())
#from math import pow
l=[]
for i in range(t):
    a=input().split(" ")
    b=input().split(" ")
    a1=int(a[1])
    b1=int(b[1])
    q = int(a[0] + "0"*a1)
    r = int(b[0] + "0"*b1)
    # s1=str(int(pow(10,a1)))
    # s2=str(int(pow(10,b1)))
    # q=int(a[0] + s1[1:])
    # r=int(b[0] + s2[1:])

    if q>r: 
        l.append(">")
        #print(">")
    elif q<r:
        l.append("<")
        #print("<")
    else:
        l.append("=")
       # print("=")
for k in range(t):
    print(l[k])
