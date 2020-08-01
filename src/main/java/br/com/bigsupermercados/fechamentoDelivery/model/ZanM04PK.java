package br.com.bigsupermercados.fechamentoDelivery.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ZanM04PK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "m00af")
	private LocalDateTime m00af;

	@Column(name = "m00za")
	private Integer m00za;

	@Column(name = "m00ac")
	private Integer m00ac;

	@Column(name = "m00ad")
	private Integer m00ad;

	public LocalDateTime getM00af() {
		return m00af;
	}

	public void setM00af(LocalDateTime m00af) {
		this.m00af = m00af;
	}

	public Integer getM00za() {
		return m00za;
	}

	public void setM00za(Integer m00za) {
		this.m00za = m00za;
	}

	public Integer getM00ac() {
		return m00ac;
	}

	public void setM00ac(Integer m00ac) {
		this.m00ac = m00ac;
	}

	public Integer getM00ad() {
		return m00ad;
	}

	public void setM00ad(Integer m00ad) {
		this.m00ad = m00ad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m00ac == null) ? 0 : m00ac.hashCode());
		result = prime * result + ((m00ad == null) ? 0 : m00ad.hashCode());
		result = prime * result + ((m00af == null) ? 0 : m00af.hashCode());
		result = prime * result + ((m00za == null) ? 0 : m00za.hashCode());
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
		ZanM04PK other = (ZanM04PK) obj;
		if (m00ac == null) {
			if (other.m00ac != null)
				return false;
		} else if (!m00ac.equals(other.m00ac))
			return false;
		if (m00ad == null) {
			if (other.m00ad != null)
				return false;
		} else if (!m00ad.equals(other.m00ad))
			return false;
		if (m00af == null) {
			if (other.m00af != null)
				return false;
		} else if (!m00af.equals(other.m00af))
			return false;
		if (m00za == null) {
			if (other.m00za != null)
				return false;
		} else if (!m00za.equals(other.m00za))
			return false;
		return true;
	}
}
