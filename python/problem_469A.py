from itertools import count


n=input()
a = input().split(" ")
b=input().split(" ")
l1=[]
l2=[]
count=0
for i in range(1,int(a[0])):
    l1.append(a[i])
# b = int(input())
for j in range(1,int(b[0])):
    l2.append(b[j])

l2.extend(l1)


for i in range(0,len(l2)):
    if l2[i]==n:
        count+=1
    else:
        continue
if count>=1:
    print("I become the guy.")
else:
    print("Oh, my keyboard!")
   # n=int(input())
# a=input().split(" ")
# b=input().split(" ")
# c=0
# ax = a[1::]
# bx = b[1::]
# if str(n) in ax:
#     c+=1
# if str(n) in bx:
#     c+=1
# if c>=1:
#     print("I become the guy.")
# else:
#     print("Oh, my keyboard!")