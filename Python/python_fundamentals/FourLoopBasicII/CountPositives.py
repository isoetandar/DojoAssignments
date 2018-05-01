def CountPositives(arr):
    i=0
    count=0
    while i<len(arr):
        if arr[i]>0:
            count+=1
        i+=1
        
    arr[len(arr)-1]=count

    return arr

print(CountPositives([2,-2,3,-2,-1,8,9,29]))