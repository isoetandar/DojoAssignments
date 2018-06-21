package com.codingdojo.web.models;

public class Dog extends Animal implements interfacePets {

	public Dog(String name, String breed, int weight) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAffection() {
		System.out.println("You created a "+getName()+"!.");
		if (getWeight() < 30) {
			return getName()+" hopend into your lap and cuddled you!.";
		} else {
			return getName()+" curled up next to you!.";
		}
	}
}
