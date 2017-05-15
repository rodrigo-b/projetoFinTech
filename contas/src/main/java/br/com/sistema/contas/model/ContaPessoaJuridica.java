package br.com.sistema.contas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.sistema.contas.model.types.TipoConta;

@Entity(name="conta_PessoaJuridica")
public class ContaPessoaJuridica extends Conta{

	@Id
	@GeneratedValue
	private int id;
	
	private String cnpj;
	
	private String razaoSocial;
	
	private String nomeFantasia;
	
	public ContaPessoaJuridica() {
		
	}
	
	public ContaPessoaJuridica(String cnpj, String razaoSocial, String nomeFantasia) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}
	
	public ContaPessoaJuridica(String nome, Date dataCriacao,TipoConta tipoConta, String cnpj,
							   String razaoSocial, String nomeFantasia )
	{
		super(nome, dataCriacao, tipoConta);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cpf) {
		this.cnpj = cpf;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String nomeCompleto) {
		this.razaoSocial = nomeCompleto;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	@Override
	public String toString() {
		return super.toString() + ", Cnpj=" + cnpj + ", Razão Social=" + razaoSocial + 
								  ", Nome Fantasia=" + nomeFantasia;
		
	}

}
