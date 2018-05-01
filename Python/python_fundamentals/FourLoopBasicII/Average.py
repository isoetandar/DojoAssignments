def avg(arr):
    sum = 0
    for i in range (0,len(arr)):
        sum += arr[i]    
    avg=sum/len(arr)
    return avg

print(avg([1,2,3,4,5]))