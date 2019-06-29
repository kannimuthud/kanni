from itertools import permutations 
  
def allPermutations(str):
    l=[]
    l1=[]
    permList = permutations(str) 
    for perm in list(permList): 
        a=''.join(perm)
        l.append(a)
    l1 = list(map(int, l))
    return l1
        
# Driver program 
if __name__ == "__main__": 
    n,n1=map(int,input().split())
    s=str(n)
    l=allPermutations(s)
    l.sort()
    #print(l)
    j=0
    mi=100000000000000000000000
    ans=-1
    for i in range(0,len(l)):
       if(n1<l[i]):
           if(l[i]-n1<mi):
            mi=l[i]-n1
            ans=l[i]
    print(ans)
