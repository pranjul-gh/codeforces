

# from numpy import zeros

# '''
# i,j=5,5   #row and coloumn
# z = zeros((i,j), int)
# l = len(z)
# for r in range(l):
#     for c in range(len(z[r])):
#         x = int(input())
#         z[r][c] = x
# '''
# a = zeros((5,5),int)
# for row in range(5):
#     for col in range(5):
#         x = int(input())
#         a[row][col] = x

# print(a)

'''
l1 = ['23', '32', '34', '43']
l2 = ['13','22','24','31','53','42','44','35']
l3 = ['12','25','14','21','41','52','54']
l4 = ['55','11','15','51']

for r in range(5):
    for c in range(5):
        if a[r][c] == 1:
            lp = r+c
            print(type(lp))
            if lp in l1:
                print(1)
                break
            if lp in l2:
                print(2)
                break
            if lp in l3:
                print(3)
                break
            if lp in l4:
                print(4)
                break
            else:
                print(None)
                break
        else:
            continue
'''
 

# m,n = 0,0
# for row in range(1,6):
#     for col in range(1,6):
#         x = int(input())
#         if x == 1:
#             m = 3-row
#             n = 3-col
# if m<0:
#     m = (m*(-1))
    
# if n<0:
#     n = (n*(-1))
  
# print(m+n)
#BufferedReader/PrintWriter

# m,n = 0,0
# for j in range(1,6):
#     x = input()
#     x = x.split(' ')
#     if x[j] == '1':
#         m = x.index('1')
#         break
#     n+=1
# a = abs(n-2)
# b = abs(m-2)
# print(a+b)

i=0
j=0
while i>-1 and i<5:
    k=input()
    k=k.split(' ')
    if '1' in k:
        j=k.index('1')
        break
    i+=1
a=abs(i-2)
b=abs(j-2)
print(a+b)