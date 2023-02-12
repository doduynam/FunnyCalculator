package me.duynam.FunnyCalculator.service;

public interface IBaseService<I, O> {

	/**
	 * Service execute interface
	 *
	 * @param input I
	 * @return O
	 */
	O execute(I input);
}
