


n=56
b=98
i=1
gcd=0
while i<=b:
    if(n%i==0 and b%i==0):
        gcd=i 
        i=i+1
    else:
        i=i+1
print(gcd)