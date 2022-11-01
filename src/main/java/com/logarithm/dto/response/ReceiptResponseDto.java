package com.logarithm.dto.response;

import com.logarithm.models.Invoice;
import com.logarithm.models.Period;
import com.logarithm.models.Receipt;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Currency;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReceiptResponseDto {
	private Integer code;
	private String message;
	private Receipt receipt;






}
