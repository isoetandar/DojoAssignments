import math
import random


def randInt(min=1):

    return round(random.random()*min)+min
    
print(randInt(min=50))