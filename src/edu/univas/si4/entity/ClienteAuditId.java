package edu.univas.si4.entity;
// Generated 03/05/2017 20:12:03 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ClienteAuditId generated by hbm2java
 */
@Embeddable
public class ClienteAuditId implements java.io.Serializable {

	private int cod;
	private String emailAnterior;
	private String emailNovo;
	private Date dataOperacao;
	private String usuario;
	private String tipoOperacao;

	public ClienteAuditId() {
	}

	public ClienteAuditId(int cod) {
		this.cod = cod;
	}

	public ClienteAuditId(int cod, String emailAnterior, String emailNovo, Date dataOperacao, String usuario,
			String tipoOperacao) {
		this.cod = cod;
		this.emailAnterior = emailAnterior;
		this.emailNovo = emailNovo;
		this.dataOperacao = dataOperacao;
		this.usuario = usuario;
		this.tipoOperacao = tipoOperacao;
	}

	@Column(name = "cod", nullable = false)
	public int getCod() {
		return this.cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Column(name = "email_anterior", length = 50)
	public String getEmailAnterior() {
		return this.emailAnterior;
	}

	public void setEmailAnterior(String emailAnterior) {
		this.emailAnterior = emailAnterior;
	}

	@Column(name = "email_novo", length = 50)
	public String getEmailNovo() {
		return this.emailNovo;
	}

	public void setEmailNovo(String emailNovo) {
		this.emailNovo = emailNovo;
	}

	@Column(name = "data_operacao", length = 29)
	public Date getDataOperacao() {
		return this.dataOperacao;
	}

	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	@Column(name = "usuario", length = 50)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "tipo_operacao", length = 10)
	public String getTipoOperacao() {
		return this.tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClienteAuditId))
			return false;
		ClienteAuditId castOther = (ClienteAuditId) other;

		return (this.getCod() == castOther.getCod())
				&& ((this.getEmailAnterior() == castOther.getEmailAnterior())
						|| (this.getEmailAnterior() != null && castOther.getEmailAnterior() != null
								&& this.getEmailAnterior().equals(castOther.getEmailAnterior())))
				&& ((this.getEmailNovo() == castOther.getEmailNovo()) || (this.getEmailNovo() != null
						&& castOther.getEmailNovo() != null && this.getEmailNovo().equals(castOther.getEmailNovo())))
				&& ((this.getDataOperacao() == castOther.getDataOperacao())
						|| (this.getDataOperacao() != null && castOther.getDataOperacao() != null
								&& this.getDataOperacao().equals(castOther.getDataOperacao())))
				&& ((this.getUsuario() == castOther.getUsuario()) || (this.getUsuario() != null
						&& castOther.getUsuario() != null && this.getUsuario().equals(castOther.getUsuario())))
				&& ((this.getTipoOperacao() == castOther.getTipoOperacao())
						|| (this.getTipoOperacao() != null && castOther.getTipoOperacao() != null
								&& this.getTipoOperacao().equals(castOther.getTipoOperacao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCod();
		result = 37 * result + (getEmailAnterior() == null ? 0 : this.getEmailAnterior().hashCode());
		result = 37 * result + (getEmailNovo() == null ? 0 : this.getEmailNovo().hashCode());
		result = 37 * result + (getDataOperacao() == null ? 0 : this.getDataOperacao().hashCode());
		result = 37 * result + (getUsuario() == null ? 0 : this.getUsuario().hashCode());
		result = 37 * result + (getTipoOperacao() == null ? 0 : this.getTipoOperacao().hashCode());
		return result;
	}

}