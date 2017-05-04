package edu.univas.si4.entity;
// Generated 03/05/2017 20:12:03 by Hibernate Tools 5.2.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Produto generated by hbm2java
 */
@Entity
@Table(name = "produto", schema = "public")
public class Produto implements java.io.Serializable {

	private Integer cod;
	private String nome;
	private int saldo;
	private Set<Item> items = new HashSet<Item>(0);

	public Produto() {
	}

	public Produto(int saldo) {
		this.saldo = saldo;
	}

	public Produto(String nome, int saldo, Set<Item> items) {
		this.nome = nome;
		this.saldo = saldo;
		this.items = items;
	}

	@GenericGenerator(name = "generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "optimizer", value = "none"),
			@Parameter(name = "sequence_name", value = "public.seq_produto"),
			@Parameter(name = "increment_size", value = "1") })
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "cod", unique = true, nullable = false)
	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Column(name = "nome", length = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "saldo", nullable = false)
	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}