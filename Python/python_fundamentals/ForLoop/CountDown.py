def CountDown(lowNum,highNum,mult):
    if lowNum > highNum:
        print("no count down!")
    for i in range (lowNum,highNum,mult):
        print(i)     
            
CountDown(8,41,4)  
CountDown(9,1,2)