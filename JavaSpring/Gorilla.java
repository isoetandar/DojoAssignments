public class Gorilla extends Mammal {
    public void throwSomething(){
        System.out.println("The Gorilla throws Something!");
        this.energyLevel = energyLevel - 5;
    }

    public void eatBanana(){
        System.out.println("Gorilla is eating a bunch bananas,.. !");
        this.energyLevel = energyLevel + 10;
    }

    public void climb(){
        System.out.println("Gorilla climbs a tree!");
        this.energyLevel = energyLevel - 10;
    }
}