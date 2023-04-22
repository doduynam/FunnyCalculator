package me.duynam.funnycalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDTO {
	private Long id;
	private String numOne;
	private String numTwo;
	private String result;
}
