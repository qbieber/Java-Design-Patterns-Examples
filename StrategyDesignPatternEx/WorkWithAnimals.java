package com.collabera.strategy;

public class WorkWithAnimals 
{
	public static void main(String[] args)
	{
		Animal sparky = new Dog();
		
		Animal tweety = new Bird();
		
		System.out.println("Dog: " + sparky.tryToFly());
		System.out.println("Bird: " + tweety.tryToFly());
	}
}
