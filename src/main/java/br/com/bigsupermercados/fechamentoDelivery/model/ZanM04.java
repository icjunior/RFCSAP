package br.com.bigsupermercados.fechamentoDelivery.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "zan_m04")
public class ZanM04 {

	@EmbeddedId
	public ZanM04PK id;

	@Column(name = "m04ae")
	private Integer m04ae;

	@Column(name = "m04ah")
	private Integer m04ah;

	@Column(name = "m04ai")
	private Integer m04ai;

	@Column(name = "m04ak")
	private BigDecimal m04ak;

	public ZanM04() {
	}

	public ZanM04(ZanM04PK id, Integer m04ae, Integer m04ah, Integer m04ai, BigDecimal m04ak) {
		super();
		this.id = id;
		this.m04ae = m04ae;
		this.m04ah = m04ah;
		this.m04ai = m04ai;
		this.m04ak = m04ak;
	}

	public Integer getM04ae() {
		return m04ae;
	}

	public void setM04ae(Integer m04ae) {
		this.m04ae = m04ae;
	}

	public Integer getM04ah() {
		return m04ah;
	}

	public void setM04ah(Integer m04ah) {
		this.m04ah = m04ah;
	}

	public Integer getM04ai() {
		return m04ai;
	}

	public void setM04ai(Integer m04ai) {
		this.m04ai = m04ai;
	}

	public BigDecimal getM04ak() {
		return m04ak;
	}

	public void setM04ak(BigDecimal m04ak) {
		this.m04ak = m04ak;
	}

	public ZanM04PK getId() {
		return id;
	}

	public void setId(ZanM04PK id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZanM04 other = (ZanM04) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valor: " + m04ak;
	}

}
