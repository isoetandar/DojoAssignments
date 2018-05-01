def Max(arr):
    Max=arr[0]
    for i in range (1,len(arr)):
        if arr[i] > Max:
            Max = arr[i]
    return Max

print(Max([7,6,5,4,6,7,3]))