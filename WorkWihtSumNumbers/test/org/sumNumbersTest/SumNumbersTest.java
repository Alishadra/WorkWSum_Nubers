package org.sumNumbersTest;

import static org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.sumNumbers.SumNumbers;

public class SumNumbersTest {

	@Test
	public void getSumNumbersByChars() {

		SumNumbers sumNumbers = new SumNumbers ();
		int result = sumNumbers.getSumNumbersByChars();
		
		assertEquals(15,result);

	}
	
	@Test
	public void getSumNumbersByDivision() {

		SumNumbers sumNumbers = new SumNumbers ();
		
		int result = sumNumbers.getSumNumbersByDivision();
		
		assertEquals(15,result);

	}

}
