package com.codingdojo.objMaster;

public class ObjectMasterTester {
	public static void main(String[] args){
        Ninja ninja = new Ninja();
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai();
        Wizard wizard1 = new Wizard();
        Wizard wizard2 = new Wizard();
        
//        wizard1.fireball(samurai2); //samurai2 health = 176
//        ninja.steal(wizard1).runAway(); //ninja health 100+10-10 wizard1 health 40 
//        samurai1.dealthBlow(wizard2); //samurai1 health 100 wizard2 health 0
//        wizard1.heal(wizard1); //wizard1 40+8
//        ninja.steal(samurai1);//ninja health 100 +10 samurai1 health 90
//        wizard1.fireball(samurai1).fireball(samurai1); //samurai1 90 - 3*8*2 = 42
//        samurai1.meditate(); // health 42+21
        
        wizard1.fireball(wizard2);
        wizard2.fireball(wizard1);
        wizard1.fireball(samurai2).fireball(wizard1);
        
//        samurai1.howMany();
//        samurai2.howMany();
          Samurai.howMany();
//        Samurai.howMany();

        ninja.displayHealth();
        samurai1.displayHealth();
        samurai2.displayHealth();
        wizard1.displayHealth();
        wizard2.displayHealth();
	}
}
