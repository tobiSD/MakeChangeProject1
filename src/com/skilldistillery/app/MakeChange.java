package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange 
{
	public static void main(String[] args) 
	{	
		double dollars, quarters, nickels, dimes;
		double penny;
		
		dollars = 0;
		quarters =0;
		nickels =0;
		dimes = 0;
		penny =0;
		
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
			System.out.println("Change due: " + newChange + "dollars");					
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
		double change = 0;
		 change = tendered - amount;
		int floor = (int) change;
		
		while (change > 1)
		{
			change = change - 1;
			int dollars = dollars +1;
			System.out.println(""+ dollars);
		}
		while (change >=0.01)
		{
			change = change -0.01;
			int penny = penny - 1;
			System.out.println(" " + penny+ "pennies");
		}
		return change;
	}
	public static double calNickels(double ammount, double tendered)
	{
		double nickels = 0.0;
		nickels = ((100/10000) * 5);
		int floor = (int) nickels;
		
		return nickels;
	}
}