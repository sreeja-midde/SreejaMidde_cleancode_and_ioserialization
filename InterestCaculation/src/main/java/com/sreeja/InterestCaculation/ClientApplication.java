package com.sreeja.InterestCaculation;

import java.io.PrintWriter;
import java.util.Scanner;

public class ClientApplication {
	private static Scanner scanner;

	public static void main(String[] args) {
		double principleAmount, rateOfInterest,  time,interest=0;
		String query;
		int choice;
		scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		CalculationofInterest calculator = new CalculationofInterest();
		do {
			out.print("\nEnter Principle Amount,rate of interest, time period : "); out.flush();
			principleAmount = scanner.nextDouble();
			rateOfInterest  = scanner.nextDouble();
			time = scanner.nextDouble();
			out.print("\n1.Simple Interest\n2.Compound Interest\nEnter the choice : ");out.flush();
			choice = scanner.nextInt();
			if(choice == 1) {
				interest = calculator.SimpleInterestCalculation(principleAmount, time, rateOfInterest);
			}
			else if(choice == 2) {
				interest = calculator.CompoundInterestCalculation(principleAmount, time, rateOfInterest);
			}
			else {
				out.print("Wrong Choice ");out.flush();
			}
			out.print("\nInterest = " + interest);
			out.print("\npress 'stop' to exit or anything to continue : "); out.flush();
			query = scanner.next();
		}while(!query.equals("stop"));
	}
}