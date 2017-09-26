package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class FractionTest {
	
	private int denominator;
	
	private int numerator;
	
	private Fraction fraction;


    @Before
    public void before() {
        denominator = 2;
        numerator = 5;
    }

    @Test
    public void testDecimal() {
    		fraction = new Fraction(numerator, denominator); 
        assertEquals(2.5, fraction.decimal(), 2);
    }
    
    @Test
    public void testGetters() {
    		fraction = new Fraction(numerator, denominator); 
        assertEquals(2, fraction.getDenominator());
        assertEquals(5, fraction.getNumerator());
    }
    @Test
    public void testMayor() { 
    	Fraction fractionAux = new Fraction(4,2);
		fraction = new Fraction(numerator, denominator); 
        assertEquals(true, fraction.major(fractionAux));
    }

}
