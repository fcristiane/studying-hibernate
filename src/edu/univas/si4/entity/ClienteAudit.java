package edu.univas.si4.entity;
// Generated 03/05/2017 20:12:03 by Hibernate Tools 5.2.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ClienteAudit generated by hbm2java
 */
@Entity
@Table(name = "cliente_audit", schema = "public")
public class ClienteAudit implements java.io.Serializable {

	private ClienteAuditId id;

	public ClienteAudit() {
	}

	public ClienteAudit(ClienteAuditId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "cod", column = @Column(name = "cod", nullable = false)),
			@AttributeOverride(name = "emailAnterior", column = @Column(name = "email_anterior", length = 50)),
			@AttributeOverride(name = "emailNovo", column = @Column(name = "email_novo", length = 50)),
			@AttributeOverride(name = "dataOperacao", column = @Column(name = "data_operacao", length = 29)),
			@AttributeOverride(name = "usuario", column = @Column(name = "usuario", length = 50)),
			@AttributeOverride(name = "tipoOperacao", column = @Column(name = "tipo_operacao", length = 10)) })
	public ClienteAuditId getId() {
		return this.id;
	}

	public void setId(ClienteAuditId id) {
		this.id = id;
	}

}
