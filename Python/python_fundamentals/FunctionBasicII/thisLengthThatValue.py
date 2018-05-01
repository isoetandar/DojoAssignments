def thisLengthThatValue(a,b):
    i=1
    arr=[]
    if a==b:
        print("Jinx!")
    if a!=b:
        while i<=a:
            arr.append(b)
            i+=1
        return arr

print(thisLengthThatValue(3,4))
print(thisLengthThatValue(4,4))