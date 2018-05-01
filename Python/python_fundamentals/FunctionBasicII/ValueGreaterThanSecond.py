def valueGreaterThanSecond(arr):
    newArr=[]
    if len(arr)<2:
        return False
    for i in arr:
        if i > arr[1]:
            newArr.append(i)
    return newArr

print(valueGreaterThanSecond([2,1,3,4,0,1]))