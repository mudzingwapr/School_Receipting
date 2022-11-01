package com.logarithm.controller;

import com.logarithm.dto.ReceiptDto;
import com.logarithm.dto.response.ReceiptResponseDto;
import com.logarithm.models.Receipt;
import com.logarithm.services.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.logarithm.services.Implem.ReceiptServiceImpleme;

import java.util.List;

@RestController
@RequestMapping("/receipt")
public class ReceiptController {
	@Autowired
	private IReceiptService receiptService;

	@PostMapping("/createReceipt")
	public ResponseEntity<ReceiptResponseDto> createRecipt(@RequestBody ReceiptDto receiptDto){
        //Receipt receipt = receiptRepo.createReceipt(receiptDto);
				return ResponseEntity.ok(receiptService.createReceipt(receiptDto));

	}
	@PostMapping("/update/{id}")
	public ResponseEntity<ReceiptResponseDto> updateReceipt(@PathVariable Integer id, @RequestBody ReceiptDto receiptDto){
		return ResponseEntity.ok(receiptService.update(id,receiptDto));
	}

	@GetMapping("/deleteReceipt/{id}")
	public void deleteReceipt(@PathVariable Integer id){
		receiptService.deleteReceipt(id);

}

     @GetMapping("/findReceipt/{id}")
	public ResponseEntity<Receipt> findReceipt(@PathVariable Integer id) {
		 return ResponseEntity.ok(receiptService.findReceipt(id));
	}

	@GetMapping("/findReceipts")
	public ResponseEntity<List<Receipt>> findAll(){
		List<Receipt> rsc= receiptService.listAll();
		return ResponseEntity.ok(rsc);

	}

}
