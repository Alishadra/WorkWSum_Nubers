package org.sumNumbers;

import java.util.logging.Logger;


public class SumNumbers {

	private static Logger logger = Logger.getLogger(SumNumbers.class.getName());
	
	public static void main(String[] args) {


		int outNum = 12345;
		
		logger.info(String.valueOf(getSumNumbersByDivision(outNum)));
		logger.info(String.valueOf(getSumNumbersByChars(outNum)));
	
	}
	protected static int getSumNumbersByChars(int outNum) {

		String numb = String.valueOf(outNum);
		
		char[] numbers = numb.toCharArray();
		
		int result=0;
		
		for(char number : numbers) {
			
			int newNum = Character.getNumericValue(number);
			
			result += newNum;
		}
		
		return result;
	}
	
	protected static int getSumNumbersByDivision(int outNum) {

		int sum = 0;
		
		for(; outNum > 0; outNum = outNum/10) {
			
			sum += outNum % 10;
		}
		
		return sum;
	}

	

}
