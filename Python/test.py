import os
import sys

class Animal:
    __name = ""
    __height= 0
    __weight = 0
    __sound = 0

    def __init__(self, name, height, weight, sound):
        self.__name = name
        self.__height= height
        self.__weight=weight
        self.__sound=0

    def set_name(self, name):
        self.__name = name
        
    def get_name(self):
        return self.__name
    
