def UltimateAnalyze(arr):
    Max = arr[0]
    Min=arr[0]
    Sum = 0
    avg=0
    Dict ={}
    for i in range (1,len(arr)):
        if arr[i] < Min:
            Min = arr[i]
        if arr[i] > Max:
            Max = arr[i]
    
        Sum += arr[i]
        avg=Sum/len(arr)
        Dict={"sumTotal":Sum,
                    "average": avg,
                    "minimum": Min,
                    "length": len(arr) }

        return Dict

print(UltimateAnalyze([7,6,5,4,6,7,3]))