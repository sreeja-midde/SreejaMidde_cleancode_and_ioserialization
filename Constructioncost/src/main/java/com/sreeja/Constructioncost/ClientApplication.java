package com.sreeja.Constructioncost;
import java.io.PrintWriter;
import java.util.Scanner;
public class ClientApplication {
	private static Scanner scanner;

	public static void main(String[] args) {
		double area, constructionCost;
		String materialStandard;
		String query;
		CostCalculation costCalculation = new CostCalculation();
		PrintWriter out = new PrintWriter(System.out);
		scanner = new Scanner(System.in);
		boolean automated=false;
		do {
			out.print("\nEnter cost of the house :");
			out.flush();
			area = scanner.nextDouble();
			out.print("\nEnter the material standard [ Standard || aboveStandard || highStandard ] :");
			out.flush();
			materialStandard = scanner.next();
			out.print("\nEnter if it fully automated [y/n] :");
			out.flush();
			if(scanner.next().equals("y")) {
				automated=true;
			}
			constructionCost = costCalculation.Cost(materialStandard, area , automated);
			out.print("\nEstimated house construction cost :" + constructionCost);
			out.print("\nPress stop to exit or anything to continue : ");
			out.flush();
			query=scanner.next();
		}while(!query.equals("stop"));
		out.close();
	}
	
}
