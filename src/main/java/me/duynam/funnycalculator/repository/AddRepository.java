package me.duynam.funnycalculator.repository;

import java.util.Optional;
import me.duynam.funnycalculator.entity.AddEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddRepository
		extends JpaRepository<AddEntity, Long> {

	Optional<AddEntity> findAddEntityByNumOneAndNumTwo(String numOne, String numTwo);
}
