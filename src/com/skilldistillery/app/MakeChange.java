package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange 
{

	public static void main(String[] args) 
	{	
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the amount of the item.");
		System.out.print("Amount: ");
		double amount = kb.nextDouble();
		
		System.out.println ("Enter the amount tendered by customer.");
		System.out.print("Tendered: ");
		double tendered = kb.nextDouble();
		
		if (tendered > amount)
		{
			System.out.println("The amount entered is greater than the purchase price.");
			double newChange = calChange(amount, tendered);
			double newNic = calNickels(amount, tendered);
			System.out.println("Change due: " + newChange + "dollars" + ", " + newNic);	
					//amount 2.5 price 5: 2 one dollar bill, 2 twenty five cents;
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
	public static double calChange(double amount, double tendered)
	{
		double change = 0.0;
		//double dollarDue = 0.0;
		change = tendered - amount;
		//dollarDue = ((10*0.100)* change);
		return change;
	}
	public static double calNickels(double ammount, double tendered)
	{
		double nickels = 0.0;
		nickels = ((100/10000) * 5);
		return nickels;
		
	}
}