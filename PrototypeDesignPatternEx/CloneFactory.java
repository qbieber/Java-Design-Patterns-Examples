package com.collabera.prototype;

public class CloneFactory 
{
	public Animal getClone(Animal animalSample) 
	{
		return animalSample.makeCopy();	
	}
}
