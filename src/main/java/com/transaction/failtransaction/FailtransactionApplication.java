package com.transaction.failtransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class FailtransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FailtransactionApplication.class, args);
	}
}
