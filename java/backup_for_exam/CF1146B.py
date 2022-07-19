# #:::::::::::::::::: not appropiate ::::::::::::::::# #

# t=list(input())
# t1copy=t.copy()
# lent1=len(t1copy)

# for i in range(len(t)):
#     if t1copy[i] == 'a':
#         t.remove('a')
# lent=len(t)
# if lent%2==0:
        
#     Sdash = t[int(len(t)/2)::]
#     S = t1copy[0:lent1-int(lent/2)]
#     stf=t1copy[lent::]
#     Strs=''
#     if (stf==Sdash) or lent==0 or S==Sdash:
#         y=Strs.join(S)
#         print(y)
#     else:
#         print(":(")
# else:
#     print(":(")



'''  approach copied from @siddhantray    '''

s=input()
str1=""
str2=""
flag=0
n=len(s)
for i in range(n):
	str1+=s[i]
	if(s[i]!="a"):
		str2+=s[i]
	if(str1+str2)==s:
		flag=1
		break

if(flag==0):
	print(":(")
else:
	print(str1)


'''   by @itrmn '''
'''
t=input()
removed=t.replace('a','')
ds=removed[int(len(removed)/2):]
s=t[:len(t)-len(ds)]
if len(removed)%2 == 1 or s.replace('a','') != ds:
    print(':(')
else:
    print(s)
'''