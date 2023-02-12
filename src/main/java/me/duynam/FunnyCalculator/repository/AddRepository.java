package me.duynam.FunnyCalculator.repository;

import java.util.Optional;
import me.duynam.FunnyCalculator.entity.AddEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddRepository
		extends JpaRepository<AddEntity, Long> {

	Optional<AddEntity> findAddEntityByNumOneAndNumTwo(String numOne, String numTwo);
}
