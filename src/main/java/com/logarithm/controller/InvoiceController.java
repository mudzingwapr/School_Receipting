package com.logarithm.controller;

import java.util.List;

import com.logarithm.dto.response.InvoiceResponseDto;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logarithm.dto.InvoiceRequestDto;
import com.logarithm.models.Invoice;
import com.logarithm.services.InvoiceService;


@RequiredArgsConstructor
@RestController
@RequestMapping("/invoice")
public class InvoiceController {

	private final InvoiceService invoiceService;

	
	@PostMapping("/save")
	public ResponseEntity<InvoiceResponseDto> createInvoice(@RequestBody InvoiceRequestDto invoiceRequestDto){
				return ResponseEntity.ok(invoiceService.save(invoiceRequestDto));
		
	}
	@GetMapping("/find-all")
	public ResponseEntity<List<Invoice>> findAll(){
		List<Invoice> ls= invoiceService.findAll();
		return ResponseEntity.ok(ls);
	}
	
	@GetMapping("/find-by-id/{id}")
public ResponseEntity<Invoice> findOne(@PathVariable Integer id) {
	
	return ResponseEntity.ok(invoiceService.findOne(id));
}
	
}
