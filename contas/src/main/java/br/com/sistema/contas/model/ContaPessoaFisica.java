package br.com.sistema.contas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.sistema.contas.model.types.TipoConta;

@Entity(name="conta_PessoaFisica")
public class ContaPessoaFisica extends Conta {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String cpf;
	
	private String nomeCompleto;
	
	private Date dataNasc;
	
	private int idContaPai;
	
	public ContaPessoaFisica() {
		
	}
	
	public ContaPessoaFisica(String cpf, String nomeCompleto, Date dataNasc ,int idContaPai)
	{
		super();
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.dataNasc = dataNasc;
	    this.idContaPai = idContaPai;
	}
	
	public ContaPessoaFisica(String nome, Date dataCriacao,TipoConta tipoConta ,String cpf, String nomeCompleto, 
					         Date dataNasc, int idContaPai)
	{
		super(nome, dataCriacao, tipoConta);
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.dataNasc = dataNasc;
	    this.idContaPai = idContaPai;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}


	public int getIdContaPai() {
		return idContaPai;
	}

	public void setIdContaPai(int idContaPai) {
		this.idContaPai = idContaPai;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", Cpf=" + cpf + ", Nome Completo=" + nomeCompleto + 
								  ", Data de Nascimento=" + dataNasc;
		
	}
}
