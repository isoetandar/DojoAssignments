package com.codingdojo.web.models;

public class Cat extends Animal {


	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
		return getName()+" looked at you.";
	}

}
