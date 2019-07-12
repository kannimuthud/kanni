l=[]
l.append(0)
l1=list(map(int,input().split()))
l=l1[:]
mm=int(input())
mm=mm-1
o=0
def kanni(l,o):
    ll=[]
    l.insert(0,0)
    l.append(0)
    for i in range(1,len(l)-1):
        if l[i-1]==l[i+1]:
            ll.append(0)
        else:
            ll.append(1)
    print(ll)
    if mm==o:
        return ll
    else:
        return kanni(ll,o+1)
i1=kanni(l1,o)
print(*i1)
