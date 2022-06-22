n = int(input())
while (n):
    n+=1
    y=set(str(n))
    if len(y)==4:
        print(n)
        break
    else:
        continue
"""--------------------------------------------"""
'''
n = int(input())
for j in range(n+1,90000):
    y=set(str(j))
    if len(y)==4:
        print(j)
        break
    else:
        continue
'''