
package com.logarithm.models;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
//import com.logarithm.utils.Config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="receipt")
public class Receipt {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer Id;
	private Integer invoiceId;
	private String classid;
	private Double amountCharged;
	private Double amountPaid;
	private String schoolId;
	private String school;
	private String studentId;
	private String studentDetails;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String narration;
	private String methodOfPay;
}

