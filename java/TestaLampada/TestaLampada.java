/*
 * Este programa ilustra a definicao e uso de uma classe em Java,
 * encapsulando dados e funcoes associadas ao TAD "Lampada". 
 */
class Lampada {
	// Estado da lampada: 0 = desligada, 1 = ligada
	// Mais adiante veremos como definir constantes	
	private int estado;
	// Tipo da lampada
	private String tipo;
	private String cor;
	// Construtor default da classe
	Lampada() {
		estado = 0;
		tipo = "incandescente";
		cor = "Amarela";
	}
	Lampada(String tipo, String cor) {
		estado = 0;
		this.tipo = tipo;
		this.cor = cor;
	}
	
	void mostra() {
		System.out.print("Lampada tipo " + tipo + ", estado ");
		if (estado == 1)
			System.out.println("ligada");
		else
			System.out.println("desligada");
		System.out.println("Cor e " + cor);
	}
		
	void desliga() {
		estado = 0;
	}		
	void liga() {
		estado = 1;
	}
}

public class TestaLampada {
	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		
		lamp.mostra();
		lamp.liga();
		lamp.mostra();
		lamp.desliga();
		lamp.mostra();

		System.out.println("");
		Lampada l2 = new Lampada("fluorescente", "verde");
		l2.mostra();

	}
}

