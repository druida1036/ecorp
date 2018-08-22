package co.com.blanclabs.ecorp.serviceImp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.com.blanclabs.ecorp.service.FraudService;

public class FraudServicesImpTest {
	
	FraudService fraudService = new FraudServicesImp();

	@Test
	public void testFindCreditCardWithFraudWithFiveDays() {
		assertEquals(600, fraudService.findCreditCardWithFraud(5));
	}

	@Test
	public void testFindCreditCardWithFraudWithSixDays() {
		assertEquals(4320, fraudService.findCreditCardWithFraud(6));
	}
}
