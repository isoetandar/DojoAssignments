package com.codingdojo.ZooKeeper;

public class Bat extends Mammal {
	

    // private int energyLevel = 300; //this is incorrect override Mammal EnergyLevel;
    public Bat(){
        this.energyLevel = 300; //Override Mammal energy Level
    }
    public void attackTown(){
        System.out.println("Bat is attaking towns, fire in towns, building tumbling, and cracking everywhere!");
        this.energyLevel = energyLevel - 100;
    }

    public void eatHuman(){
        System.out.println("Giant Bat eats human, scarrryyy .. !");
        this.energyLevel = energyLevel + 25;
    }

    public void fly(){
        System.out.println("Zooosssh, Giant Bat taking off ...!");
        this.energyLevel = energyLevel - 50;
    }

}
