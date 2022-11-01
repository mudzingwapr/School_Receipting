package com.logarithm.controller;

import java.util.List;

import com.logarithm.dto.response.InvoiceResponseDto;
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

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	@Autowired
	private InvoiceService invoiceService;
	//@Autowired
	//private IInvoiceserviceImpl  studentService;
	
	@PostMapping("/save")
	public ResponseEntity<InvoiceResponseDto> createInvoice(@RequestBody InvoiceRequestDto invoiceRequestDto){
				return ResponseEntity.ok(invoiceService.save(invoiceRequestDto));
		
	}
	@GetMapping("/findall")
	public ResponseEntity<List<Invoice>> findAll(){
		List<Invoice> ls= invoiceService.findAll();
		return ResponseEntity.ok(ls);
	}
	
	@GetMapping("/findOne/{id}")
public ResponseEntity<Invoice> findOne(@PathVariable Integer id) {
	
	return ResponseEntity.ok(invoiceService.findOne(id));
}
	
}
