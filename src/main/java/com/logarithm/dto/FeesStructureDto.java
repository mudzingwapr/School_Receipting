
package com.logarithm.dto;

import com.logarithm.models.Period;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeesStructureDto {
	private String schoolId;
	private String school;
	private String classId;
	private Period period;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String narration;
	private Double fees;
	
}

