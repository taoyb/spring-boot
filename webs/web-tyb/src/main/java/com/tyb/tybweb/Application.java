package com.tyb.tybweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories({
		"com.tyb.tybmod"
})
@EntityScan({
		"com.tyb.tybmod"
})
@ComponentScan(basePackages = "com")
//@ServletComponentScan(basePackages = "com")
//开启事务
//@EnableTransactionManagement
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
