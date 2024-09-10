package com.micda.banking_api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	 List<Transaction> findByAccountId(String accountId);
}
