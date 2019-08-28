package com.collabera.factory;

import java.util.Scanner;

public class EnemyShipTesting 
{
	public static void main(String[] args) 
	{
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		Scanner usrin = new Scanner(System.in);
		
		System.out.println("What type of ship? (U / R / B)");
		
		if(usrin.hasNextLine())
		{
			String typeOfShip = usrin.nextLine();
			
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if (theEnemy != null)
		{
			doStuffEnemy(theEnemy);
		}
		else
		{
			System.out.println("Enter a U, R, or B next time");
		}
		
		
		usrin.close();
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip)
	{
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
