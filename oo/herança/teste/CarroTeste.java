package oo.heran�a.teste;


import oo.heran�a.DesafioHeranca.Civic;
import oo.heran�a.DesafioHeranca.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		// instanciar civic e ferrari
		// acelerar e frear 
		// verificar velocidade
		
		Ferrari c1 = new Ferrari(400);
		Civic c2 = new Civic();
		//Carro c3 = new Carro(180);
	
		
		System.out.println("Ferrari: " + c1 + " Km/h");
		System.out.println("Civic: " + c2 + " Km/h");
		
		c1.acelerar();
		c2.acelerar();
		
		System.out.println("Ferrari: " + c1 + " Km/h");
		System.out.println("Civic: " + c2 + " Km/h");
		
	
		c1.desligarAr();
		c1.ligarAr();
		c1.ligarTurbo();
		c1.acelerar();
		
		System.out.println("Ferrari: " + c1 + " Km/h");
		System.out.println("Civic: " + c2 + " Km/h");
	}

}
