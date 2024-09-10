package com.micda.banking_api;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;                 // Clé primaire auto-incrémentée
	 private String accountId;        // Référence au `numcomp` du compte associé
	 private Double amount;           // Montant de la transaction
	 private LocalDateTime transactionDate; // Date de la transaction
	 private String type;             // Type de la transaction ("DEBIT" ou "CREDIT")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 
	 
}
