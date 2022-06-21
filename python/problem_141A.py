n = input()
c = input()
p = input()
count=0
for i in range(len(p)):
    for nn in range(len(n)):
        if n[nn] in p:
            continue
        else:
            count+=1
            break
    for cc in range(len(c)):
        if c[cc] in c:
            continue
        else:
            count+=1
            break
if count > 0:
    print("NO")
else:
    print("YES")

    