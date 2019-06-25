a=list(map(int,input().split()))
l=[]
a.sort()
def kan(n,s):
    #print (n," ",s)
    for i in range(n):
        print(s,end=" ")
for i in a:
    if i not in l:
        l.append(i)
f=[]
ff=[]
for i in range(0,len(l)):
    c=0
    for j in range(0,len(a)):
        if l[i]==a[j]:
            c=c+1
    f.append(c)
for i in f:
    if i not in ff:
        ff.append(i)
ff.sort()
#print(l)
for i in range(0,len(ff)):
    for j in range(0,len(f)):
        if ff[i]==f[j]:
            kan(f[j],l[j])
            
