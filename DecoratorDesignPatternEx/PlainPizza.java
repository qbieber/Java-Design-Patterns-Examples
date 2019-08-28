package com.collabera.decorator;

public class PlainPizza implements Pizza
{
	public String getDescription() 
	{	
		return "Thin dough";
	}

	public Double getCost() 
	{
		System.out.println("Cost of Dough: " + 4.00);
		
		return 4.00;
	}
}
