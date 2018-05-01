class Car:
    def __init__(self, price, speed, fuel, mileage):
        self.price = price
        self.speed = speed
        self.fuel = fuel
        self.mileage = mileage
        if self.price > 10000:
            self.tax = '15%'
        else:
            self.tax = '12%'

    def display_all(self):
        print(f"Price:{self.price} \nSpeed:{self.speed} \nFuel:{self.fuel} \nMileaage: {self.mileage} \nTax:{self.tax}") 


                


CarOne = Car(2000, '35mph', "Full", '25mpg')
CarOne.display_all()
Cartwo = Car(12000, '78mph', "Half Full", '29mpg')
Cartwo.display_all()