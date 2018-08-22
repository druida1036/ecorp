package co.com.blanclabs.ecorp.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("co.com.blanclabs.ecorp")
public class EcorpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcorpApplication.class, args);
	}
}
