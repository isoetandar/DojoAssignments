function binSearch( arr, num) {
    var right = arr.length-1
    var left = 0
    var mid = Math.floor(right/2)
    while (num != arr[mid]){  
        if (num < arr[mid]) {  
            right = mid
        }
        else {
            var left = mid 
        }
        mid = Math.floor(right-left)/2    
    }
    return mid // Index of array
}