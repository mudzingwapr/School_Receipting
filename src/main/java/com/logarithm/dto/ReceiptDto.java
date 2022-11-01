package com.logarithm.dto;

import java.time.LocalDate;

import com.logarithm.models.Period;

import lombok.Data;

@Data
public class ReceiptDto {
	private Integer invoiceno;
	private Double amountCharged;
	private Double amountDue;
	private String schoolId;
	private String school;
	private String studentId;
	private String studentDetails;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String narration;
	private String methodOfPay;

	

}
