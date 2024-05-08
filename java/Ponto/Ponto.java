import static java.lang.Math.*;

class Ponto {
	public float x, y;

	Ponto() {
		x = y = 0;
	}
	Ponto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public void desloca(float dx, float dy) {
		x += dx;
		y += dy;
	}
	
	public float distancia(Ponto p1) {
		float dx = this.x - p1.x;
		float dy = this.y - p1.y;
		float distancia = (float)Math.sqrt((dx*dx) + (dy*dy));
		System.out.println("Distancia = " + distancia);
		return distancia; 
	}
	public void mostra() {
		System.out.println("("+ x +","+ y +")");
	}
}

class Main {
	public static void main(String args[]) {
		Ponto p1 = new Ponto();
		p1.desloca(40,0);
		Ponto p2 = new Ponto(20, 0);
		p1.distancia(p2);		
	}
}

