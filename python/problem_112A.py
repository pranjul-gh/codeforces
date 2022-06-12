

s1 = input()
s2 = input()
st1 = list(s1.upper())
st2 = list(s2.upper())

# for i in st1:
#     for j in st2:
#         if i<j :
#             print(-1)
#             break
#         if i>j :
#             print(1)
#             break
#         else:
#             print(0)

if st1 == st2:
    print(0)
else:
    for k in range(len(s1)):
        if (st1[k] > st2[k]):
            print(1)
            break
        if (st1[k] < st2[k]):
            print(-1)
            break
        else:
            continue

"""another easy approach is here"""

a = str(input()).lower()
b = str(input()).lower()
if a < b:
    print('-1')
elif a > b:
    print('1')
else:
    print('0')