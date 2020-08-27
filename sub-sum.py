#https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
t = (int(input()))

for i in range(0,t):
    n,s = list(map(int,input().split()))
    a = list(map(int,input().split()))
    l=0
    r=-1
    ts=0
    while True and ts!=s and l<len(a):
        if(ts<s):
            r+=1
            if r==len(a):
                break
            ts+=a[r]
        if(ts>s):
            ts-=a[l]
            l+=1

    if(ts==s):
        print(str(l+1)+" "+str(r+1))
    else:
        print("-1")
