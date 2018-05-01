def Minimum(arr):
    Min=arr[0]
    for i in range (1,len(arr)):
        if arr[i] < Min:
            Min = arr[i]
    return Min

print(Minimum([7,6,5,4,6,7,3]))