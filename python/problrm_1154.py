## wrong solution
x = input().split(" ")
l = list(x)
l1=[]
for j in range(4):
    a = int(l[j])
    l1.append(a)
print(l1)

mxm = max(l1)
print(mxm)
l.remove(mxm)

# for i in range(3):
#     al = int(mxm)-int(l[i])
#     print(al,end= ' ')