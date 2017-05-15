package br.com.sistema.contas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistema.contas.model.ContaPessoaFisica;
import br.com.sistema.contas.repository.ContaPessoaFisicaRepository;

@Service
public class ContaService {

	@Autowired
	private ContaPessoaFisicaRepository repository;
	
}
