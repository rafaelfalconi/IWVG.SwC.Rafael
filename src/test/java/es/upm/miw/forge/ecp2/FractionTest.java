package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fraction;

    @Before
    public void before() {
        this.fraction = new Fraction(6, 3); // valores a calcular
    }

    @Test
    public void testDecimal() {
        assertEquals(2, this.fraction.decimal(), 0.1);
    }
    
    @Test
    public void testInverse() {
        Fraction f = fraction.inverse();
        assertEquals(3, f.getNumerator());
        assertEquals(6, f.getDenominator());
    }

}
