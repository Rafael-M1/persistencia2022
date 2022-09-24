package edu.ifmt.cobrancaifmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.cobrancaifmt.modelo.Titulo;
import edu.ifmt.cobrancaifmt.repository.TituloRepository;


@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	@Autowired
	private TituloRepository titulos;
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo.html";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Titulo titulo) {
		System.out.println(titulo);
		titulos.save(titulo);
		return "CadastroTitulo.html";
	}
}
