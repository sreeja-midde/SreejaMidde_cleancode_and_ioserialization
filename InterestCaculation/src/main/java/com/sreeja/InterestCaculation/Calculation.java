package com.sreeja.InterestCaculation;

public interface Calculation {
	public abstract double SimpleInterestCalculation(double principleAmount, double time, double rateOfInterest);
	
	public abstract double CompoundInterestCalculation(double principleAmount, double time, double rateOfInterest);

}
