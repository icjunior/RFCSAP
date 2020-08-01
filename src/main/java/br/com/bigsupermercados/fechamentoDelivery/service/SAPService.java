package br.com.bigsupermercados.fechamentoDelivery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoTable;

import br.com.bigsupermercados.fechamentoDelivery.model.ZanM04;
import br.com.bigsupermercados.fechamentoDelivery.sap.Destination;

@Service
public class SAPService {

	public void gravar(List<ZanM04> fechamento) {

		JCoDestination destination;
		try {
			destination = JCoDestinationManager.getDestination(Destination.SomeSampleDestinations.ABAP_AS1);
			destination.ping();
			JCoFunction function = destination.getRepository().getFunction("Z_VALOR_OPERADOR");

			if (function == null) {
				throw new RuntimeException("Z_VALOR_OPERADOR not found in SAP.");
			}

			JCoTable envio = function.getTableParameterList().getTable("T_ZFIS057");

			envio.appendRows(fechamento.size());

			fechamento.stream().forEach(f -> {
				envio.setValue("FUNCAO", f.getM04ae());
				envio.setValue("DATA", f.getId().getM00af().toString());
				envio.setValue("LOJA", f.getId().getM00za());
				envio.setValue("PDV", f.getId().getM00ac());
				envio.setValue("OPERADOR", f.getM04ah());
				envio.setValue("FINALIZADORA", f.getM04ai());
				envio.setValue("VALOR", f.getM04ak());
				envio.nextRow();
			});

			function.execute(destination);

			int retorno = function.getExportParameterList().getInt("RETORNO");
			System.out.println("Retorno do processamento: " + retorno);

		} catch (JCoException e) {
			e.printStackTrace();
			throw new RuntimeException("Problemas ao conectar no sistema SAP " + e.getMessageText());
		}
	}
}
