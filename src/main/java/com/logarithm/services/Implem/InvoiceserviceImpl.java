package com.logarithm.services.Implem;

import java.time.LocalDate;
import java.util.List;

import com.logarithm.dto.response.InvoiceResponseDto;
import com.logarithm.models.Receipt;
import com.logarithm.utils.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logarithm.dto.InvoiceRequestDto;
import com.logarithm.models.Invoice;
import com.logarithm.repository.InvoiceRepository;
//import com.logarithm.repository.ReceiptRepository;
import com.logarithm.services.InvoiceService;

import javax.persistence.EntityNotFoundException;

@Service
public class InvoiceserviceImpl implements InvoiceService {
	@Autowired
	private InvoiceRepository invoicerepos;
	/*@Autowired
	private StudentRepository studentRepo;*/
	
//	@Autowired
//	private ReceiptRepository receiptrepo;

	@Override
	public InvoiceResponseDto save(InvoiceRequestDto invoiceRequestDto) {
		Invoice invoice = new Invoice();

		invoice.setAmountCharged(invoiceRequestDto.getAmountCharged());
		//invoice.setAmountDue(invoiceRequestDto.getAmountDue());
		Config.getAmountDue(null,invoice);
		invoice.setSchool(invoice.getSchool());
		invoice.setClassid(invoiceRequestDto.getClassid());
		invoice.setAmountCharged(invoiceRequestDto.getAmountCharged());
		invoice.setSchool(invoiceRequestDto.getSchool());
		invoice.setSchoolId(invoiceRequestDto.getSchoolId());
		invoice.setStudentDetails(invoiceRequestDto.getStudentDetails());
		invoice.setStudentId(invoiceRequestDto.getStudentId());
		invoice.setCreatedDate(LocalDate.now());
		invoice.setSchool(invoiceRequestDto.getSchool());
		Invoice in = invoicerepos.save(invoice);

		InvoiceResponseDto invoiceResponseDto = new InvoiceResponseDto();
		invoiceResponseDto.setCode(200);
		invoiceResponseDto.setMessage("Invoice successfully generated.");
		invoiceResponseDto.setInvoice(in);
		return  invoiceResponseDto;

	}

	@Override
	public Invoice findOne(Integer id) {
		var invoice=invoicerepos.findById(id).orElseThrow(()->new EntityNotFoundException("Invoice not found"));

		return invoice;
	}

	@Override
	public List<Invoice> findAll() {
		
		return invoicerepos.findAll();
	}

	@Override
	public Invoice UpdateInvoice(InvoiceRequestDto invo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> fullyPaid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInvoice(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Invoice> NotFullyPaid() {
		// TODO Auto-generated method stub
		return null;
	}

}
