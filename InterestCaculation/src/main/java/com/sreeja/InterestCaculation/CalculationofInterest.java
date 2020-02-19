package com.sreeja.InterestCaculation;

public class CalculationofInterest implements Calculation{
	
	public double SimpleInterestCalculation(double principleAmount, double time, double rateOfInterest) {
		
		return (principleAmount * time * rateOfInterest) / 100.0;
		
	}
	
	public double CompoundInterestCalculation(double principleAmount, double time, double rateOfInterest) {
		
		return principleAmount * Math.pow((1+rateOfInterest/100), time);
	}
	
}
