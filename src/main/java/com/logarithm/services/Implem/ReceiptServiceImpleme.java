package com.logarithm.services.Implem;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.logarithm.dto.ReceiptDto;
import com.logarithm.dto.response.ReceiptResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.logarithm.models.Receipt;
import com.logarithm.repository.InvoiceRepository;
import com.logarithm.repository.ReceiptRepository;
import com.logarithm.services.IReceiptService;
//import com.logarithm.utils.Config;
@Service
public class ReceiptServiceImpleme implements IReceiptService {
    @Autowired
    private ReceiptRepository receipRepos;
    @Autowired
    private InvoiceRepository invoiceRepo;


    @Override
    public ReceiptResponseDto createReceipt(ReceiptDto receiptDto) {
        Receipt receipt = new Receipt();


        receipt.setAmountCharged(receiptDto.getAmountCharged());
        receipt.setAmountPaid(receiptDto.getAmountCharged());
        receipt.setSchool(receiptDto.getSchool());
        receipt.setInvoiceId(receiptDto.getInvoiceno());
        receipt.setAmountCharged(receiptDto.getAmountCharged());
        receipt.setSchool(receiptDto.getSchool());
        receipt.setSchoolId(receiptDto.getSchoolId());
        receipt.setStudentDetails(receiptDto.getStudentDetails());
        receipt.setStudentId(receiptDto.getStudentId());
        receipt.setCreatedDate(LocalDate.now());
        receipt.setSchool(receiptDto.getSchool());
        receipt.setNarration(receiptDto.getNarration());
        receipt.setMethodOfPay(receiptDto.getMethodOfPay());
        Receipt rcpt = receipRepos.save(receipt);
        ReceiptResponseDto receiptResponseDto = new ReceiptResponseDto();
        receiptResponseDto.setCode(200);
        receiptResponseDto.setMessage("Receipt successfully created");
        receiptResponseDto.setReceipt(rcpt);
        return receiptResponseDto;


    }

    @Override
    public Receipt findReceipt(Integer id) {
        Optional<Receipt> receipt= receipRepos.findById(id);
        if(receipt.isPresent()){
            return receipt.get();
        }else

        return  new Receipt();
    }

    @Override
    public ReceiptResponseDto update(Integer id, ReceiptDto receiptDto) {
        Optional<Receipt> receipt1=receipRepos.findById(id);
        if(receipt1.isPresent()) {
            Receipt receipt=receipt1.get();
            receipt.setAmountCharged(receiptDto.getAmountCharged());
            receipt.setAmountPaid(receiptDto.getAmountCharged());
            receipt.setSchool(receiptDto.getSchool());
            receipt.setAmountCharged(receiptDto.getAmountCharged());
            receipt.setSchool(receiptDto.getSchool());
            receipt.setSchoolId(receiptDto.getSchoolId());
            receipt.setStudentDetails(receiptDto.getStudentDetails());
            receipt.setStudentId(receiptDto.getStudentId());
            receipt.setCreatedDate(LocalDate.now());
            receipt.setSchool(receiptDto.getSchool());
            receipt.setNarration(receiptDto.getNarration());
            receipt.setMethodOfPay(receiptDto.getMethodOfPay());
            Receipt rcpt = receipRepos.save(receipt);
            ReceiptResponseDto receiptResponseDto = new ReceiptResponseDto();
            receiptResponseDto.setCode(200);
            receiptResponseDto.setMessage("Receipt successfully Updated");
            receiptResponseDto.setReceipt(rcpt);
            return receiptResponseDto;

        }
        return null;
    }

    @Override
    public List<Receipt> listAll() {
        List<Receipt> receiptList= receipRepos.findAll();
        return receiptList;
    }

    @Override
    public void deleteReceipt(Integer id) {
        Optional<Receipt> receipt = receipRepos.findById(id);
        if(receipt.isPresent()){
            receipRepos.findById(id);
        }else
            System.out.println("No such a receipt found");

    }



}
