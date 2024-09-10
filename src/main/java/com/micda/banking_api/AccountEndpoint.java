package com.micda.banking_api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.micda.banking_api.SoapRequestsResponses.GetBalanceRequest;
import com.micda.banking_api.SoapRequestsResponses.GetBalanceResponse;
import com.micda.banking_api.SoapRequestsResponses.GetTransactionsResponse;
import com.micda.banking_api.SoapRequestsResponses.TransactionSoap;


@Endpoint
public class AccountEndpoint {
		
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	private static final String NAMESPACE_URI = "http://api/accounts";
	
	//Consultation du solde du compte 
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBalanceRequest")
    @ResponsePayload
    public GetBalanceResponse getBalance(@RequestPayload GetBalanceRequest request) {
        GetBalanceResponse response = new GetBalanceResponse();
        Account account = accountRepository.findByNumcomp(request.getAccountId());

        if (account != null) {
            response.setBalance(account.getBalance());
        } else {
            response.setBalance(BigDecimal.ZERO);
        }

        return response;
    }
    
    // Historique des transactions 
    
    
}
