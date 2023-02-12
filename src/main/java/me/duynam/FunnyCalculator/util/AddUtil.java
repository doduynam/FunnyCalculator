package me.duynam.FunnyCalculator.util;

public class AddUtil {
	public static String addTwoNumber(String numOne, String numTwo) {
		final Long numberOne = Long.parseLong(numOne);
		final Long numberTwo = Long.parseLong(numTwo);

		final Long result = numberOne + numberTwo;

		return result.toString();
	}
}
