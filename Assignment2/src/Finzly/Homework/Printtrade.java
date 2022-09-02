package Finzly.Homework;

import java.util.ArrayList;

public class Printtrade {
 
	static ArrayList<FXtrading> ft = new ArrayList<>();
	static void add(int tradeNo, String Name, String CurrencyPair, double Amount )
	{
		ft.add(new  FXtrading(tradeNo, Name, CurrencyPair, Amount, 66.00));
		
	}
	
	public static void print() {
		System.out.println("tradeNO\n" + "CurrencyPair\n" + "Name\n" + "Amount\n" + "Rate\n");
		if(ft.isEmpty()) {
			System.out.println("NO transation record present..! ");
			
		}
		
		for( FXtrading i : ft) {
			System.out.println(i);
		}
		
		Run.run();
	}
	
}
