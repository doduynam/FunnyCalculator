/**
 * FunnyCalculator Project
 */
package me.duynam.FunnyCalculator.controller;

import lombok.RequiredArgsConstructor;
import me.duynam.FunnyCalculator.dto.request.RequestDTO;
import me.duynam.FunnyCalculator.dto.response.ResponseDTO;
import me.duynam.FunnyCalculator.service.IAddService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AddController
 *
 * @author duynam.do
 * @since 12/02/2023
 */
@RestController
@RequestMapping( "/add")
@RequiredArgsConstructor
public class AddController {

	private final IAddService addService;

	/**
	 * Api: "/add/"
	 * Get sum of two number
	 *
	 * @param requestDTO
	 * @return
	 */
	@PostMapping("/")
	public ResponseDTO addTwoNumber(@RequestBody RequestDTO requestDTO) {
		final IAddService.Input input =
				new IAddService.Input(
						requestDTO.getNumOne(),
						requestDTO.getNumTwo());

		final IAddService.Output output = addService.execute(input);

		return new ResponseDTO(
				output.getId(),
				output.getNumOne(),
				output.getNumTwo(),
				output.getResult());
	}

}
