class Animal:
    def  __init__(self, name, health):
        self.name = name
        self.health = health

    def walk(self):
        self.health -=1
        #return self

    def run(self):
        self.health -=5
        #return self

    def display_health(self):
        print(f"Animal's health status:{self.health}")


print("===================================")
Elephant = Animal("Gajah", 100)
Elephant.walk()
Elephant.run()
Elephant.run()
Elephant.display_health()
print("===================================")


class Dog(Animal):
    def __init__(self):
        super().__init__(Dog, 150) #use super to call Animal __init() method

    def pet(self):
        self.health +=5
    
    def display_health(self):
        print(f"Dog's health status:{self.health}")

print("===================================")
Nero = Dog()
Nero.walk()
Nero.run()
Nero.run()
Nero.run()
Nero.pet()
Nero.fly()
print("let me see here")
Nero.display_health()
print("===================================")

class Dragon(Animal):
    def __init__(self):
        super().__init__(Dragon, 170)
    
    def fly(self):
        self.health-=10

    def display_health():
        super().display_health()
        print("I am a Dragon")
        #print(f"Dog's health status:{self.health}")
