package Finzly.Homework;

import java.util.Scanner;

public class Run {
	
	public static void run() {
		
		Booktrade BT = new Booktrade();
		Printtrade PT = new Printtrade();
		Exit e = new Exit();
		
		System.out.println("I Book Trade - 1");
		System.out.println("I Print Trades - 2");
		System.out.println("Exit - 3");
		
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		
		switch(op) {
		case 1: BT.trade();
				break;
				
		case 2: PT.print();
		break;
		
		case 3: e.exit();
		break;
		
		default : 
			System.out.println("Invalid Value");
			run();
			break;
		}
	}

}
