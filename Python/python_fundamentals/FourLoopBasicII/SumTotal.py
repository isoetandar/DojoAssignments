def SumTotal(list):
    sum = 0
    i = 0
    while i < len(list):
        sum += list[i]
        i+=1
    
    return sum

print(SumTotal([1,2,3,4]))