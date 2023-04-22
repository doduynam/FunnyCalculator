package me.duynam.funnycalculator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fc_add")
@Data
@NoArgsConstructor
public class AddEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "num_one")
	private String numOne;

	@Column(name = "num_two")
	private String numTwo;

	@Column(name = "result")
	private String result;
}
