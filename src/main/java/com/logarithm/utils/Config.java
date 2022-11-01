package com.logarithm.utils;

import org.springframework.stereotype.Component;

import com.logarithm.models.Invoice;
import com.logarithm.models.Receipt;
@Component
public interface Config {
	/*
	 * @Autowired public static ReceiptRepository rece;
	 *
	 * @Autowired public static InvoiceRepository invo;
	 */



 public static void getAmountDue(Receipt rs,Invoice in) {

	 Double amountdue =rs.getAmountPaid()-in.getAmountDue();
	 	 in.setAmountDue(amountdue);
 }

}
