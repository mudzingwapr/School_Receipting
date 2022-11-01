package com.logarithm.services;

import java.util.List;

import com.logarithm.dto.InvoiceRequestDto;
import com.logarithm.dto.response.InvoiceResponseDto;
import com.logarithm.models.Invoice;

public interface InvoiceService {
	
	public InvoiceResponseDto save(InvoiceRequestDto invo);
    public Invoice findOne(Integer id);
    public List<Invoice> findAll();
    public Invoice UpdateInvoice(InvoiceRequestDto invo);
    public List<Invoice> fullyPaid();
    public void deleteInvoice(Integer id);
    public List<Invoice> NotFullyPaid();
    
}
