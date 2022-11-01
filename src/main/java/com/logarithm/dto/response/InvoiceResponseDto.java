package com.logarithm.dto.response;

import com.logarithm.models.Invoice;
import com.logarithm.models.Period;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Currency;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class InvoiceResponseDto {
	private Integer code;
	private String message;
	private Invoice invoice;

}
