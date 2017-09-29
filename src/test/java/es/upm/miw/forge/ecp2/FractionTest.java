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

    
    @Test
    public void testDivide() {
    	fraction = new Fraction (numerator, denominator);
    	Fraction aux = new Fraction (3,5);
    	this.fraction.divide(aux);
    	
    	assertEquals(this.fraction.getNumerator(),25);
    	assertEquals(this.fraction.getDenominator(),6);
    }   

    @Test
    public void testMultiply() {
        Fraction fraction = new Fraction(1,2);
        Fraction fraction2 = new Fraction(1,2);
        Fraction fractionMultiplied = fraction.multiply(fraction2);
        assertEquals(fractionMultiplied.getNumerator(), 1);
        assertEquals(fractionMultiplied.getDenominator(), 4);
    }
    
}
