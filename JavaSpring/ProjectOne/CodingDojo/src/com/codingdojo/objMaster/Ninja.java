package com.codingdojo.objMaster;

public class Ninja extends Human {

	public Ninja() {
		// TODO Auto-generated constructor stub
		this.stealth = 10;
	}
	
	public Ninja steal(Human stealed) {
		stealed.health = stealed.health - this.stealth;
		this.health = this.health + this.stealth;
		return this;
	}
	
	public Ninja runAway() {
		this.health -=10;
        return this;
	}

}
