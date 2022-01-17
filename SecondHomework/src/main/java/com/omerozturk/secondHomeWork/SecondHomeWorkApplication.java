package com.omerozturk.secondHomeWork;

import com.omerozturk.secondHomeWork.service.entityservice.CategoryEntityService;
import com.omerozturk.secondHomeWork.service.entityservice.CustomerEntityService;
import com.omerozturk.secondHomeWork.service.entityservice.ProductCommentEntityService;
import com.omerozturk.secondHomeWork.service.entityservice.ProductEntityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecondHomeWorkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SecondHomeWorkApplication.class, args);
		CategoryEntityService categoryEntityService = applicationContext.getBean(CategoryEntityService.class);
		ProductEntityService productEntityService = applicationContext.getBean(ProductEntityService.class);
		CustomerEntityService customerEntityService = applicationContext.getBean(CustomerEntityService.class);
		ProductCommentEntityService productCommentEntityService = applicationContext.getBean(ProductCommentEntityService.class);

	}

}
