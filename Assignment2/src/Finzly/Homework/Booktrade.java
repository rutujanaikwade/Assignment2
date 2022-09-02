package Finzly.Homework;

import java.util.Scanner;

public class Booktrade {

	static int count =0;
	
	public static void trade() {
		final double INR = 66.00;
		String Name;
		String CurrencyPair;
		double Amount;    
		String Rate;
		double USDtoINR;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer Name");
	    Name = sc.nextLine();
	    System.out.println("Enter Currency Pair");
	    CurrencyPair = sc.nextLine();
	    System.out.println("Enter Amount to transfer");
	    Amount = sc.nextDouble();
	    System.out.println("Do you want to get Rate(yes/no)");
	    Rate = sc.next();
	    
	    //converting usd to inr
	    
	    USDtoINR = INR *Amount;
	    
	    if(Rate.equalsIgnoreCase("yes")) {
	    	System.out.println("You are transferring INR" + USDtoINR + "to" + Name + "(Assuming that rate was 66.00)");
	    	
	    }else if(Rate.equalsIgnoreCase("no")) {
	    	System.out.println("Enter yes to get transferring amount");
	    	
	    }else {
	    	System.out.println("Invalid Value");
	    }
	   
		System.out.println("Book/Cancel this trade ?");
		
		//Book Conformation
		String cheak = sc.next();
		if(cheak.equalsIgnoreCase("Book")) {
			count++;
			System.out.println("Trade for" + "  " + CurrencyPair.toUpperCase() + " " + "has been booked with rate" + INR + "," + "The amount of Rs+ " + USDtoINR + "" + "will be transferred in 2 wprking days to" + " " + Name + "...");
			Printtrade.add(count, Name, CurrencyPair, Amount);
			Run.run();
		}else if (cheak.equalsIgnoreCase("Cancel")) {
			System.out.println("Trade is Cancelled.");
			Run.run();
		}else {
			System.out.println("Invalid Value.");
		}
	}
	
}
