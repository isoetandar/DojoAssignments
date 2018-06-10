package com.codingdojo.objMaster;

public class HumanTest {
	public static void main(String[] args) {
		Human human1 = new Human(); //attack
		Human human2 = new Human(); //attacked
		//human1 attack human
		human1.attack(human2);
		human1.displayHealth();
		human2.displayHealth();
	}
}
