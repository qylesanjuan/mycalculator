import static org.junit.Assert.*;

import org.junit.Test;

/* AUTHOR: QYLE JOHN DLA. SAN JUAn
 * PROGRAM DESCRIPTION: Test Bench  for MyCalculator.java
 * DATE ACCOMPLISHED: 2/25/15 6:39 pm
 * 
 * 
 */

public class MyTester {

	@Test
	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(4);
		
		assertEquals("4! = 5", 5, actual, 0.0);
	}
	
	@Test
	public void testNfactorial1() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(1);
		
		assertEquals("1! = 1", 1, actual, 0.0);
	}
	
	@Test
	public void testNfactorial2() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(-1);
		//TESTING OF NEGATIVE NUMBERS WILL RESULT TO AN ERROR
		assertEquals("-1! = ERROR", -1, actual, 0.0);
	}

	@Test
	public void testBinarySearch() {
		MyCalculator mc = new MyCalculator();
		int[] a = {1, 2, 3, 4, 5};
		int actual = mc.binarySearch(a, 2);
		//IF THE ARRAY IS SORTED, AND ITEM CAN BE FOUND
		assertEquals("SORTED, ITEM FOUND", 1, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch1() {
		MyCalculator mc = new MyCalculator();
		int[] a = {1, 3, 3, 4, 5};
		int actual = mc.binarySearch(a, 2);
		//IF THE ARRAY IS SORTED, AND ITEM CAN NOT BE FOUND
		assertEquals("SORTED, ITEM NOT FOUND", -1, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch2() {
		MyCalculator mc = new MyCalculator();
		int[] a = {5, 4, 2, 3, 1};
		int actual = mc.binarySearch(a, 2);
		//IF THE ARRAY IS UNSORTED, AND ITEM CAN BE FOUND
		assertEquals("UNSORTED, ITEM FOUND", 1, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch3() {
		MyCalculator mc = new MyCalculator();
		int[] a = {5, 1, 3, 4, 1};
		int actual = mc.binarySearch(a, 2);
		//IF THE ARRAY IS UNSORTED, AND ITEM CAN NOT BE FOUND
		assertEquals("UNSORTED, ITEM NOT FOUND", -1, actual, 0.0);
	}

}
