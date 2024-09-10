package com.micda.banking_api;

public class TransferRequest {

	private String creditorId;  // Identifiant du compte receveur
    private Double amount;      // Montant à transférer

    // Getters et Setters
    public String getCreditorId() {
        return creditorId;
    }

    public void setCreditorId(String creditorId) {
        this.creditorId = creditorId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
