x = input()
l=len(x)-1
pl = list(set(x[1:l]))
if len(x) <= 4:
    print(len(x[1:l]))
else:
    pl.remove(" ")
    pl.remove(",")
    print(len(pl))
