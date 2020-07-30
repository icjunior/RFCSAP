package br.com.bigsupermercados.fechamentoDelivery.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bigsupermercados.fechamentoDelivery.model.ZanM04;
import br.com.bigsupermercados.fechamentoDelivery.repository.ZanM04Repository;

@Service
public class FechamentoService {

	@Autowired
	private ZanM04Repository repository;

	@Autowired
	private SAPService sap;

	public void gravar(LocalDateTime data) {
		List<ZanM04> fechamentos = repository.findById_M00afAndM04aiAndM04aeNot(data, 4, 158);
		sap.gravar(fechamentos);
	}
}
