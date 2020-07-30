package br.com.bigsupermercados.fechamentoDelivery;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.bigsupermercados.fechamentoDelivery.service.FechamentoService;

@SpringBootApplication
public class FechamentoDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FechamentoDeliveryApplication.class, args);
	}

	@Bean
	public CommandLineRunner dados(FechamentoService fechamentoService) {
		return (args) -> {
			LocalDateTime data = LocalDateTime.of(LocalDate.now(), LocalTime.of(0, 0));
			fechamentoService.gravar(data);					
		};
	}
}
