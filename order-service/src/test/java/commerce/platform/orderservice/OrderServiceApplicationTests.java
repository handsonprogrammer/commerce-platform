package commerce.platform.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;

@SpringBootTest
class OrderServiceApplicationTests {

	@Container
	static MySQLContainer mySQLContainer = new MySQLContainer("mysql:8.0");

	static {
		mySQLContainer.withDatabaseName("order-service").start();
	}

	@DynamicPropertySource
	static void setProperties(DynamicPropertyRegistry dymDynamicPropertyRegistry) {
		dymDynamicPropertyRegistry.add("spring.datasource.url", mySQLContainer::getJdbcUrl);
		dymDynamicPropertyRegistry.add("spring.datasource.username",mySQLContainer::getUsername);
		dymDynamicPropertyRegistry.add("spring.datasource.password",mySQLContainer::getPassword);
	}

	@Test
	void contextLoads() {
	}

}
