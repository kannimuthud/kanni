n=int(input())
c=1
for i in range(1,n+1):
    for j in range(0,i):
        print(c,end="")
        c=c+1
        if j<i-1:
            print("*",end="")
    print()
m=c
t=0
for i in range(n,0,-1):
    c=m-n+t
    m=c
    for j in range(i,0,-1):
        print(c,end="")
        c=c+1
        if(j>1):
            print("*",end="")
    c=c+1
    t=t+1
    print()
        
