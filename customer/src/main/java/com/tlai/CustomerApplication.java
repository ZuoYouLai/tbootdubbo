package com.tlai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CustomerApplication {

	private final Logger logger = LoggerFactory.getLogger(getClass());



	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class);
	}



//	@Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
//	private DemoService demoService;


//	@Bean
//	public ApplicationRunner runner() {
//		return args -> {
//			logger.info(demoService.sayHello("samlai"));
//		};
//	}

}
