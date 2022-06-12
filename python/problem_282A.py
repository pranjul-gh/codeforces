# """NOT SOLVED YET"""
# lst = []
# n = int(input())
# for i in range(n):
#     x = input()
#     lst.append(x)
# #print(lst)
# st = ' '
# s = st.join(lst)
# #print(s)
# #print()
# y = s.replace("--X", "-1").replace("X--", "0").replace("X++", "0").replace("++X", "1")
# z = y.split(" ")
# #print(z)
# p = 0 
# for j in z:
#     sun=int(j)
#     p = p+sun 
# print(p)



y = 0
i = int(input())
lst = []
for n in range(1,i+1):

    inp = str(input())
    lst.append(inp)
#print(lst)
for j in range(0,len(lst)):
    
    if lst[j]  == '++X' or 'X++':
        y+=1
        #continue
    else :
        y-=1
        #continue
print(y)
