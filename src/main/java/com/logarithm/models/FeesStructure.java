
package com.logarithm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="fees_structure")
public class FeesStructure {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer Id;
	private String schoolId;
	private String school;
	private String classId;
	private Period period;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String narration;
	private Double fees;
}

