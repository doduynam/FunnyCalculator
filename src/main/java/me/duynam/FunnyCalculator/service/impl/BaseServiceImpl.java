package me.duynam.FunnyCalculator.service.impl;

import lombok.extern.slf4j.Slf4j;
import me.duynam.FunnyCalculator.service.IBaseService;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public abstract class BaseServiceImpl<I, O> implements IBaseService<I, O> {

	@Override
	public O execute(I input) {
		try {
			preDoing(input);
			return doing(input);
		}
		catch (Exception exception) {
			throw exception;
		}
	}

	/**
	 * Handle Validate
	 *
	 * @param input Input
	 */
	protected abstract void preDoing(I input);

	/**
	 * Process business
	 *
	 * @param input Input
	 * @return Output
	 */
	protected abstract O doing(I input);
}
