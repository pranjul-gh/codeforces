i = input().split(' ')
w = int(i[2])
n = int(i[1])
k = int(i[0])
res = ((w*(w+1))/2)*k
if res>n:
    print(int(((w*(w+1))/2)*k)-n)
else:
    print(0)
