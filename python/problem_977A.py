# q = int(input())

# b=int(input())
# p=q
# l = len(str(q))

# for i in range (b):
#     a = str(p)
#     if a[l-1] != '0':
#         p = p-1
#     elif a[l-1] == '0':
#         p = p/10
# print(int(p))

c=input().split(' ')
b=int(c[1])
a = int(c[0])
for i in range(b):
    if a%10==0:
        a = a/10
    else:
        a = a-1
print(int(a))
