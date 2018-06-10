package com.codingdojo.objMaster;

public class Samurai extends Human {
	
//	public static int counter=0;
	public static int counter=0;

	public Samurai() {
		// TODO Auto-generated constructor stub
		this.health = 200;
		counter++;
	}
	
	public Samurai dealthBlow(Human killed){
        killed.health = 0;
        this.health = this.health/2;
        return this;
    }

    public Samurai meditate(){
        this.health += this.health/2;
        return this;
    }

    public static void howMany(){
//        return counter;
    	  System.out.println(counter);
    }

}
