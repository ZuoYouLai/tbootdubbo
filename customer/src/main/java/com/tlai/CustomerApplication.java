package com.tlai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CustomerApplication {




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
