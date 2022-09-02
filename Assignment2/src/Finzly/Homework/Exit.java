package Finzly.Homework;

import java.util.Scanner;

public class Exit {
	
	public static void exit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you really want to exit(y/n)");
		String YorN = sc.next();
		
		if(YorN.equalsIgnoreCase("y")) {
	    	System.out.println("Thank You So Much!");
	    	
	    }else if(YorN.equalsIgnoreCase("n")) {
	    	System.out.println("Enter yes to get transferring amount");
	    	//RunnerMethod.runnerMethod();
	    }else {
	    	System.out.println("Invalid Value");
	    	exit();
	    }
	   
	}

}
