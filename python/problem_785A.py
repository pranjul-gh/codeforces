n=int(input())
sum=0
for i in range(n):
    a=input()
    if a[0]=='T':
        sum = sum+4
        continue
    elif a[0] == 'C':
        sum = sum+6
        continue
    elif a[0] == 'O':
        sum = sum+8
        continue
    elif a[0] == 'D':
        sum = sum+12
        continue
    elif a[0] == 'I':
        sum = sum+20
        continue
print(sum)
