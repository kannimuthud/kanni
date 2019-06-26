n=int(input())
n1=int(input())
n2=int(input())
s=0
p=1
while n>=p:
    r=(n//p)%10
    if(r==n1):
        r=n2
    s=r*p+s
    p=p*10
print(s)
