# x=int(input("enter weight:--:"))/2

# if (x%2==0):print("YEmS")
# else:print("NO")

# x=len(set(str(input())))%2
# if x == 0:
#     print("CHAT WITH HER!")
# else:
#     print("IGNORE HIM!")

# n=int(input('enter rows--'))
# for i in range(n):
#     a = input("enter: -")
#     y = len(a)
#     if y>10:
#         print(a[0]+str(y-2)+a[y-1])
#     else:
#         print(a)
'''
cn=0
i = int(input("no."))
for r in range(i):
    a = list(input("BIN"))
    s = a.count('1')
    if s>=2:
        cn+=1
    else:
        continue
print(cn)
'''
'''
X = input()
y = X.split(' ')
M = int(y[0])
N = int(y[1])

if (M%2 == 0):
   print(int((M/2)*N))
if (M%2 != 0 and M>2):
   print(int((((M-1)/2)*N)+N/2))
if M<2:
    print(int((N/2)))
'''
'''
count=0
x=input()
y=input()
M=x.split(' ')
n= int(M[0])
k= int(M[1])
g=y.split(' ')

for i in range(0,n):
    if (int(g[i]) >= int(g[k-1]) and int(g[i]) > 0):
        count+=1
print(count)
'''
