package com.logarithm.services;

import java.util.List;

import com.logarithm.dto.ReceiptDto;
import com.logarithm.dto.response.ReceiptResponseDto;
import com.logarithm.models.Receipt;

public interface IReceiptService {

	ReceiptResponseDto createReceipt(ReceiptDto py);

	Receipt findReceipt(Integer id);
	ReceiptResponseDto update(Integer id,ReceiptDto py);
	List<Receipt> listAll();
	void deleteReceipt(Integer id);



}
