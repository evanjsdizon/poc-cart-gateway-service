package com.cd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@SpringBootApplication
public class PocCartGatewayServiceApplication {

	@Value("${app.grpc-host}")
	private String grpcHost;
	
	@Value("${app.grpc-port}")
	private int grpcPort;
	
	public static void main(String[] args) {
		SpringApplication.run(PocCartGatewayServiceApplication.class, args);
	}

	@Bean
	public ManagedChannel getManagedChannel() {
		return ManagedChannelBuilder
				.forAddress(grpcHost, grpcPort)
				.usePlaintext()
				.build();
	}
}
