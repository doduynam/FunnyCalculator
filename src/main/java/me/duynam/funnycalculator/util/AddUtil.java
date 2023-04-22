package me.duynam.funnycalculator.util;

public class AddUtil {
	public static String addTwoNumber(String numOne, String numTwo) {
		final Long numberOne = Long.parseLong(numOne);
		final Long numberTwo = Long.parseLong(numTwo);

		final long result = numberOne + numberTwo;

		return Long.toString(result);
	}
}
