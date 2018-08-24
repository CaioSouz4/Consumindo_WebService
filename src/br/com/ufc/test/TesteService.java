package br.com.ufc.test;

import br.com.ufc.model.CEP;
import br.com.ufc.service.CepService;

public class TesteService {

	public static void main(String[] args) {
	
		CEP cep = new CepService("63600000").retornarCep();
		
		System.out.println(cep.getCidade());
	}

}
