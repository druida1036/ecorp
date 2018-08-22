package co.com.blanclabs.ecorp.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import co.com.blanclabs.ecorp.conf.EcorpApplication;
import co.com.blanclabs.ecorp.conf.TestContext;
import co.com.blanclabs.ecorp.service.FraudService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { EcorpApplication.class, TestContext.class })
@WebAppConfiguration
public class CreditCardControllerTest {

	
	private MockMvc mockMvc;

	@Autowired
	private FraudService fraudService;
	
	@Autowired
    private WebApplicationContext webApplicationContext;

	@Test
	public void testFindCreditCardWithFraud() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		when(fraudService.findCreditCardWithFraud(1)).thenReturn(1l);
		 
        mockMvc.perform(get("/creditcard/fraud/{dias}", 1L))
                .andExpect(status().isOk());
                
        verify(fraudService, times(1)).findCreditCardWithFraud(1);
        verifyNoMoreInteractions(fraudService);
	}

}
