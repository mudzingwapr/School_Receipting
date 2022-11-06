package com.logarithm.dto;

import java.util.Currency;

import com.logarithm.models.Period;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InvoiceRequestDto {
	private Integer Id;
	private Double amountCharged;
	private Double amountDue;
	private String schoolId;
	private String classid;
	private String school;
	private String studentId;
	private String studentDetails;
	private Currency currency;
	private Period period;
	private String narration;
	private String methodOfPay;

}
