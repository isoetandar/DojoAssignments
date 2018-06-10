package com.codingdojo.objMaster;

public class Wizard extends Human {

	public Wizard() {
		// TODO Auto-generated constructor stub
		this.health = 50;
		this.intelligence =8;
	}
	
	public Wizard heal(Human healedOther) {
		healedOther.health = healedOther.health + this.intelligence;
		return this;
		
	}
	
	public Wizard fireball(Human attackedOther) {
		attackedOther.health = attackedOther.health - this.intelligence*3;
		return this;
		
	}

}
