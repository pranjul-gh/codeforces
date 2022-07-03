p,m,pe=0,0,0
P=[]
M=[]
PE=[]
n=int(input())
x=input().split()
for i in range(n):
    if x[i]=="1":
        p+=1
        P.append(i+1)
    elif x[i]=="2":
        m+=1
        M.append(i+1)
    else:
        pe+=1
        PE.append(i+1)
y=min(p,m,pe)
print(y)
for i in range(y):
    print(P[i],'',M[i],'',PE[i])
