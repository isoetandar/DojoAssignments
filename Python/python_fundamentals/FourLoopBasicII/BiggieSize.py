def BiggieSize(arr):
    i=0
    while i < len(arr):
        if arr[i]<0:
            arr[i] = "big"
        i+=1
    return arr

print(BiggieSize([2,5,-3,4,-5,-1,7]))