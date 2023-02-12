package me.duynam.FunnyCalculator.service;

import lombok.AllArgsConstructor;
import lombok.Data;

public interface IAddService
		extends IBaseService<IAddService.Input, IAddService.Output> {

	@Data
	@AllArgsConstructor
	class Input {
		private String numOne;
		private String numTwo;
	}

	@Data
	@AllArgsConstructor
	class Output {
		private Long id;
		private String numOne;
		private String numTwo;
		private String result;
	}
}
