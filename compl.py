import math
def val(s):
    dd=0
    if s==" ":
        dd=0
    if s=="a" or 
def kanni(n):
    f=0
    s=round(math.sqrt(n))
    l1=abs((s*s)-n)
    l2=abs(((s-1)*(s-1))-n)
    l3=abs(((s+1)*(s+1))-n)
    k=min(l1,l2,l3)
    if k==l1:
        f=s
    if k==l2:
        f=s-1
    if k==l3:
        f=s+1
        
    return f
s=input()
a=b=c=d="9"
le=len(s)
if(le==0):
    print(a,b,c,d)
else:
    k=kanni(le)
    print(le)
    s=list(s)
    for i in range(len(s),k*k):
        s.append(" ")
print(len(s))
a=val(s[0])
b=val(s[k-1])
c=val(s[le])
d=val(s[le-k+1])
print(a,b,c,d)
