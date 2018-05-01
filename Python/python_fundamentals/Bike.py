class Bike:
    def __init__(self, price, max_speed, miles):
        self.price = price
        self.max_speed = max_speed
        self.miles = miles

    def displayInfo(self):
        print(f"The bike price is {self.price}. Max Speed: {self.max_speed}. Total miles: {self.miles}")
        return self

    def ride(self):
        self.miles+=10
        print(f"Riding-Total miles: {self.miles}")
        return self

    def reverse(self):
        self.miles-=5
        print(f"Reversing-Total miles: {self.miles}")
        return self


bike1=Bike(200,60,0)
bike1.displayInfo()
bike1.ride()
bike1.ride()
bike1.reverse()
