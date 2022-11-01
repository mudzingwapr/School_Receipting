package com.logarithm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logarithm.models.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
