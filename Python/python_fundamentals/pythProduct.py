class Product:
    def __init__(self, Price, Item_Name, Weight, Brand):
        self.Price = Price
        self.Item_Name = Item_Name
        self.Weight = Weight
        self.Brand = Brand
        self.Status = 'for sale'

    def Sell(self):
        self.Status ='sold'

    def Tax(self,decimal):
        self.Price += decimal*self.Price

    def Return(self, reason_for_return):
        if reason_for_return =="defective":
            self.Price = 0
        elif reason_for_return == "in the box":
            self.Status = "for sale"
        elif reason_for_return == "open box":
            self.Status = "used"
            self.Price = 0.8*self.Price
        else:
            print("Please mention reason for return")

    def DisplayInfo(self):
        print(f"Price:{self.Price}\nItem_Name:{self.Item_Name}\nWeight:{self.Weight}\nBrand:{self.Brand}\nStatus:{self.Status}")


print("======================================")
TV = Product(300, "Visual Media", "6 lbs", "Sonny")
TV.Sell()
TV.Tax(.12)
TV.DisplayInfo()
print("======================================")
SoundSystems = Product(250, "Sound Systems" , "7lbs", "Panasonic" )
SoundSystems.Return("open box")
SoundSystems.DisplayInfo()
print("======================================")
