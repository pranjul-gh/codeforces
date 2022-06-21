n=int(input())
x=input()
y=x.lower()


l=len(set(y))

if l >= 26:
    print("YES")
else:
    print("NO")

