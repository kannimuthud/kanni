l1=list(map(int,input().split()))
l2=list(map(int,input().split()))
c=0
for i in range(0,len(l1)):
    c=0
    for j in range(0,len(l2)):
        if l1[i]==l2[j] and l1[j]!=l2[j]:
            c=c+1
            if (c==1):
                print(l1[i],"->",l1[j],end="")
            else:
                print(",",l1[j])
    if c==0:
        print(l1[i],"->","Not a manager")
