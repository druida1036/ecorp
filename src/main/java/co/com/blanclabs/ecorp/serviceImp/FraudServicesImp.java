package co.com.blanclabs.ecorp.serviceImp;

import org.springframework.stereotype.Service;

import co.com.blanclabs.ecorp.service.FraudService;

@Service
public class FraudServicesImp implements FraudService {

	@Override
	public long findCreditCardWithFraud(int dias) {
		return dias * factorial(dias);
	}

	private long factorial(int numero) {
		return numero == 0 ? 1 : numero * factorial(numero - 1);
	}

}
