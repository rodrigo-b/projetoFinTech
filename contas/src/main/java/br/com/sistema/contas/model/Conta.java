package br.com.sistema.contas.model;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import br.com.sistema.contas.model.types.TipoConta;

/**
 * Classe de entidade: Conta
 * 
 * @author Rodrigo
 * @version 1.0
 */
@MappedSuperclass
public class Conta {

	private String nome;
	
	private Date dataCriacao;
	
	@Enumerated(EnumType.STRING)
	private TipoConta tipoConta;
	
	public Conta() {

	}

	public Conta(String nome, Date dataCriacao, TipoConta tipoConta) {
		super();
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.tipoConta = tipoConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	@Override
	public String toString() {
		return "Nome=" + nome + ", Data de Criacao=" + dataCriacao;
	}
}
