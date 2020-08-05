package br.com.bigsupermercados.fechamentoDelivery.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bigsupermercados.fechamentoDelivery.model.ZanM04;

public interface ZanM04Repository extends JpaRepository<ZanM04, Integer>{

	List<ZanM04> findById_M00afAndM04aiAndM04aeNotOrderByM04akAsc(LocalDateTime data, Integer m04ai, Integer m04ae);

}
