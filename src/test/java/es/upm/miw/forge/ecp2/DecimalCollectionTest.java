package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DecimalCollectionTest {
	private DecimalCollection decimalCollection;

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void before() {
		this.decimalCollection = new DecimalCollection();
		this.decimalCollection.add(2.0);
		this.decimalCollection.add(-1.0);
		this.decimalCollection.add(3.0);
		this.decimalCollection.add(2.0);
	}

	@Test
	public void testDecimalCollection() {
		this.decimalCollection = new DecimalCollection();
		assertEquals(0, this.decimalCollection.size());
	}

	@Test
	public void testAdd() {
		assertEquals(4, this.decimalCollection.size());
	}

	@Test
	public void testSum() {
		assertEquals(6.0, this.decimalCollection.sum(), 10e-5);
	}
		

	@Test
	public void testSumArithmeticExceptionIfEmpty() {
		exception.expect(ArithmeticException.class);
		new DecimalCollection().sum();
	}
	
	@Test
    public void testResta() {
        assertEquals(-6.0, this.decimalCollection.resta(), 10e-5);
    }
	
	@Test
    public void testRestaArithmeticExceptionIfEmpty() {
        exception.expect(ArithmeticException.class);
        new DecimalCollection().resta();
    }

	@Test
	public void testHigher() {
		assertEquals(3.0, this.decimalCollection.higher(), 10e-5);
	}

	@Test
	public void testHigherArithmeticExceptionIfEmpty() {
		exception.expect(ArithmeticException.class);
		new DecimalCollection().higher();
	}
	   @Test
	    public void testmultiply() {
	        assertEquals(-12.0, this.decimalCollection.multiply(), 10e-5);
	    }
	

	 @Test
	 public void testLesser() {
	     assertEquals(-1.0, this.decimalCollection.lesser(), 10e-5);
	 }

	 @Test
	 public void testLesserArithmeticExceptionIfEmpty() {
	     exception.expect(ArithmeticException.class);
	     new DecimalCollection().lesser();
	 }

}
