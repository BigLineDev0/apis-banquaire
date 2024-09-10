package com.micda.banking_api;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
	
    private String acountId;
	
    private BigDecimal balance;
    
	public String getAcountId() {
		return acountId;
	}
	public void setAcountId(String acountId) {
		this.acountId = acountId;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
    
    
 
	
}
