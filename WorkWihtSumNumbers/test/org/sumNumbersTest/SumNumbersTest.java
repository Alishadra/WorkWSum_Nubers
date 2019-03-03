package org.sumNumbersTest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.sumNumbers.SumNumbers;

public class SumNumbersTest {

	@Test
	public void getSumNumbersByChars() {

		SumNumbers sumNumbers = new SumNumbers ();
		int result = sumNumbers.getSumNumbersByChars(12345);
		
		assertEquals(15,result);

	}
	
	@Test
	public void getSumNumbersByDivision() {

		SumNumbers sumNumbers = new SumNumbers ();
		
		int result = sumNumbers.getSumNumbersByDivision(12345);
		
		assertEquals(15,result);

	}

}
