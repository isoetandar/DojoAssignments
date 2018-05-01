import math
import random


def randInt(min=55, max=50):
        delta = max-min
        return round(random.random()*delta)+min
    
print(randInt(min=50, max=500))