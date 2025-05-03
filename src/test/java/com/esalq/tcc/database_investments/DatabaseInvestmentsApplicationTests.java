package com.esalq.tcc.database_investments;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = { 
		"spring.kafka.listener.auto-startup=false", 
		"spring.datasource.driver-class-name=org.mockito.Mockito",
	    "spring.datasource.url=jdbc:mock:test",
	    "spring.jpa.hibernate.ddl-auto=none" })
@ActiveProfiles("test")
class DatabaseInvestmentsApplicationTests {

	@Test
	void contextLoads() {
	}

}
