package com.logarithm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logarithm.models.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {

}
