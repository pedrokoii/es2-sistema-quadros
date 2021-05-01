import javax.swing.JOptionPane;

public class Retangulo extends Quadro {
	public double base;
	public double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		
		area();
		perimetro();
	}
	
	public void area() {
		this.area = base * altura;
	}
	
	public double perimetro() {
		this.perimetro = 2 * (base + altura);
	}
	
}
