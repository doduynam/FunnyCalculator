package me.duynam.funnycalculator.service.impl;

import jakarta.transaction.Transactional;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import me.duynam.funnycalculator.entity.AddEntity;
import me.duynam.funnycalculator.repository.AddRepository;
import me.duynam.funnycalculator.service.IAddService;
import me.duynam.funnycalculator.util.AddUtil;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class AddServiceImpl
		extends BaseServiceImpl<IAddService.Input, IAddService.Output>
		implements IAddService {

	private final AddRepository addRepository;

	@Override
	protected void preDoing(Input input) {
		// do nothing
	}

	@Override
	protected Output doing(Input input) {
		final String numOne = input.getNumOne();
		final String numTwo = input.getNumTwo();
		AddEntity addEntity =
				addRepository.findAddEntityByNumOneAndNumTwo(
						numOne,
						numTwo
				).orElse(null);

		if (Objects.nonNull(addEntity)) {
			return new Output(
					addEntity.getId(),
					addEntity.getNumOne(),
					addEntity.getNumTwo(),
					addEntity.getResult());
		}

		addEntity = new AddEntity();
		addEntity.setNumOne(numOne);
		addEntity.setNumTwo(numTwo);
		addEntity.setResult(
				AddUtil.addTwoNumber(
						numOne,
						numTwo));

		addEntity = addRepository.save(addEntity);

		return new Output(
				addEntity.getId(),
				addEntity.getNumOne(),
				addEntity.getNumTwo(),
				addEntity.getResult());
	}
}
