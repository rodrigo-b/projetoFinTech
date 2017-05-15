package br.com.sistema.contas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.sistema.contas.model.Conta;
import br.com.sistema.contas.model.ContaPessoaFisica;
import br.com.sistema.contas.model.ContaPessoaJuridica;
import br.com.sistema.contas.model.types.TipoConta;
import br.com.sistema.contas.service.ContaService;

@Controller
public class ContasController {

	@Autowired
	private ContaService repository;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("iniciogerenciador")
	public String gerenciadorSistema()
	{
		return "inicioGerenciador";
	}
	

	@RequestMapping("telaconsulta")
	public String telaConsulta(){
		return "telaConsulta";
	}
	
	@RequestMapping("formularioconsultapessoafisica")
	public String consultarConta(){
		
		return "formularioConsultaPf";
	}
	
	@RequestMapping("acaoConsulta")
	public String acaoConsulta(@RequestParam("cpf") String cpf,Model model)
	{
		return "formularioCadastro";
	}
	
	@RequestMapping("formulariocadastro")
	public String fomularioCadastro()
	{
		return "formularioCadastro";
	}
}
