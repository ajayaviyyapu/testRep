package com.ajayexamples.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.ajayexamples.soap.api.loanEligibilityObjects.GetLoanEligibilityStatusRequest;
import com.ajayexamples.soap.api.loanEligibilityObjects.GetLoanEligibilityStatusResponse;
import com.ajayexamples.soap.api.services.LoanEligibilityService;

@Endpoint
public class LoanEligibilityEndPoint {
	
	private static final String NAMESPACE_URL = "http://www.ajayexamples.com/soap/api/loanServices";
	
	@Autowired
	private LoanEligibilityService loanEligibiltyService;
	
	@PayloadRoot(namespace = NAMESPACE_URL,localPart = "getLoanEligibilityStatusRequest")
	@ResponsePayload
		public  GetLoanEligibilityStatusResponse getLoanStatus(@RequestPayload GetLoanEligibilityStatusRequest req)
	{
		return loanEligibiltyService.checkLoanEligibility(req);
	}
	
	
}
