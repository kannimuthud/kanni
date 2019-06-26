n=int(input())
l1=list(map(int,input().split()))
l2=list(map(int,input().split()))
c=0
l=[]
ln=[]
def kanni1(l,l1):
    ll=[]
    for i in range(0,len(l)):
        if l[i] not in l1:
            ll.append(l[i])
    return ll
    return ll
def kanni(l):
    ln=[]
    for i in range(0,len(l2)):
        if l==l2[i]:
            ln.append(l1[i])
    return ln
for i in range(0,len(l1)):
    c=0
    for j in range(0,len(l2)):
        if l1[i]==l2[j] and l1[j]!=l2[j]:
            l.append(l1[j])
            c=c+1
    
        if j==n-1 and c!=0:
            re=[]
           
            if len(l)>0:
                 
                for k in range(0,len(l)):
                    ll=kanni(l[k])
                    if len(ll)>0:
                        re.append(ll)
                lll=kanni1(l,re)
                print(l1[i],"->",lll,"Direct manager") 
                if len(re)>0:
                    print(re,"Indirect manager")
                re=[]
    
    if c==0:
        print(l1[i],"->","Not a manager")

   
