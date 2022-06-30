package exce��o.personalizadaA;

@SuppressWarnings("serial")
public class numeroForaIntervaloException extends RuntimeException{
	private String nomeDoAtributo;
	
	public numeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O Atributo '%s' est� fora do intervalo",
				nomeDoAtributo);
	}
	
	
}
