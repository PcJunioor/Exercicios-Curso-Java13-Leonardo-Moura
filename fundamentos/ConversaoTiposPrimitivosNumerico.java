package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {
		
		double a = 1; //convers�o impl�cita
		System.out.println(a);
		
		float b =  (float) 1.0;  //convers�o expl�cita (CAST)
		System.out.println(b);  
		
		int c = 4;
		byte d = (byte) c; //expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; //expl�cita (CAST)
		System.out.println(f);
	}

}
