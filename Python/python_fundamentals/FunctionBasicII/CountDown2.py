def countDownArray(a):
    arr=[]
    for i in range (a,-1,-1):
        arr.append(i)
    return arr

print(countDownArray(10))
