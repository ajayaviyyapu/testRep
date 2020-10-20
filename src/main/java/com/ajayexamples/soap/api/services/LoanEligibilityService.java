package com.ajayexamples.soap.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import com.ajayexamples.soap.api.loanEligibilityObjects.GetLoanEligibilityStatusRequest;
import com.ajayexamples.soap.api.loanEligibilityObjects.GetLoanEligibilityStatusResponse;

@Service
@PropertySource("classpath:messages.properties")
public class LoanEligibilityService {
	
	@Autowired
	private Environment env;
	
	public GetLoanEligibilityStatusResponse checkLoanEligibility(GetLoanEligibilityStatusRequest req) {
		GetLoanEligibilityStatusResponse ack = new GetLoanEligibilityStatusResponse();
		List<String> mismatchCriteria = ack.getCriteriaMismatch();
		if(!(req.getAge()>30 && req.getAge()<60))
			mismatchCriteria.add(env.getProperty("agecriteria.failmessage"));
		if(!(req.getYearlyIncome()>30000))
			mismatchCriteria.add(env.getProperty("salarycriteria.failmessage"));
		if(!(req.getCibilScore()>300))
			mismatchCriteria.add(env.getProperty("cibilcriteria.failmessage"));
		
		if(mismatchCriteria.size() > 0)
		{
			ack.setApprovedAmount(0);
			ack.setIsEligible(false);
		}
		else 
		{
			ack.setApprovedAmount(50000);
			ack.setIsEligible(true);
			mismatchCriteria.clear();
		}
		
		return ack;
		
	}

}
