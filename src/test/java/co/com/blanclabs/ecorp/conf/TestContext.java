package co.com.blanclabs.ecorp.conf;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.blanclabs.ecorp.service.FraudService;

@Configuration
public class TestContext {

	@Bean
	public FraudService fraudService() {
		return Mockito.mock(FraudService.class);
	}
}