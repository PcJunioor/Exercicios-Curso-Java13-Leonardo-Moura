package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		
		// EM CASOS DE HERAN�A N�O ACESSA VIDA INST�NCIA DE OBJETO
		// ACESSA O ATRIBUTO DIRETAMENTE
		System.out.println(protegido);
		System.out.println(publico);
		
	}

}
