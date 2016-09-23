package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
	public void primeTest() {
		assertTrue(MyInteger.isPrime(23));
	}
	@Test
	public void oddTest() {
		assertTrue(MyInteger.isOdd(23));
	}
	@Test
	public void evenTest() {
		assertTrue(MyInteger.isEven(741284));
	}
	@Test
	public void equalTest() {
		MyInteger jawn = new MyInteger(23);
		assertTrue(jawn.equals(23));
	}
	@Test
	
	public void notPrimeTest() {
		assertFalse(MyInteger.isPrime(45));
	}
	@Test
	public void notOddTest() {
		assertFalse(MyInteger.isOdd(2));
	}
	@Test
	public void notEvenTest() {
		assertFalse(MyInteger.isEven(23));
	}
	@Test
	public void notEqualTest() {
		MyInteger jawn = new MyInteger(23);
		assertFalse(jawn.equals(45));
	}	
}
