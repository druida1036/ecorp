package co.com.blanclabs.ecorp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.com.blanclabs.ecorp.service.FraudService;

@RestController
public class CreditCardController {

	@Autowired
	private FraudService fraudService;

	@GetMapping("/creditcard/fraud/{dias}")
	public long findCreditCardWithFraud(@PathVariable int dias) {

		return fraudService.findCreditCardWithFraud(dias);
	}

}