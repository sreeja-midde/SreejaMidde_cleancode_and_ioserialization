package com.sreeja.InterestCaculation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public static void testSimpleInterest() {
		CalculationofInterest c = new CalculationofInterest();
		assertEquals(600.0,c.SimpleInterestCalculation(10000, 3, 2),0.0);
		assertEquals(562.5,c.SimpleInterestCalculation(15000, 1.5, 2.5),0.0);
		assertEquals(1875.0,c.SimpleInterestCalculation(100000, 1.5, 1.25),0.0);
	}
    
    public static void testCompoundInterest() {
    	CalculationofInterest c = new CalculationofInterest();
		assertEquals(10707.588720000002,c.CompoundInterestCalculation(10090, 3, 2),0.0);
		assertEquals(56033.176389969034,c.CompoundInterestCalculation(55000, 1.25, 1.5),0.0);
		assertEquals(101880.84722483417,c.CompoundInterestCalculation(100000, 1.5, 1.25),0.0);
	}
    public void testApp()
    {
        testSimpleInterest();
        testCompoundInterest();
    }
    
    }
