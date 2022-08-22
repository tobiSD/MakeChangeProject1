package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange 
{

	public static void main(String[] args) 
	{	
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the amount of the item."); //ask user for price of item
		System.out.print("Amount: ");
		double amount = kb.nextDouble();
		
		System.out.println ("Enter the amount tendered by customer."); //ask for the amount paid by customer
		System.out.print("Tendered: ");
		double tendered = kb.nextDouble();
		
		if (tendered > amount)
		{
			//Initialise the coins
			int numDollars =0;
			int numQ = 0;
			int numN = 0;
			int numD = 0;
			int numPennies = 0;
			int bill;
			
			//price of the item / 2 = nearest highest bill

			System.out.println("The tendered amount is greater than the amount of item");
			double change = tendered - amount;
			int coins = (int) (change * 100);
			int floor = (int) change;
			System.out.println("Change due: " + change);
			
//			bill= (int) tendered / 2;
//			System.out.print(bill + " Dollar Bill"+ "\t");
//			amount = amount % 10;
			
			numDollars =(int) (coins/ 100);
			coins = coins % 100;
			//(floor) = (int) change;
			System.out.print("Dollars: "  + numDollars + "\t");

			numQ = (int)(coins / 25); // 25cents
			coins = coins % 25;
			System.out.print("Quarters: "+ numQ + "\t");
		
			numD = (int)(coins / 10); // 10 cents
			coins = coins % 10;
			System.out.print("Dimes: "+ numD + "\t");
			
			numN = (int)(coins/ 5); //5cents
			coins = coins % 15;
			System.out.print("Nickels: "+ numN + "\t");
			
			numPennies = (int)(coins / 1); //cents
			coins = coins % 1;
			System.out.print("pennies: "+ numPennies);
			
		}
		else if (tendered == amount)
		{
			System.out.println("The tendered the exact purchase amount,no change due");
		}
		else
		{
			System.out.println("The amount tendered is too litle");	
		}

	}
}
