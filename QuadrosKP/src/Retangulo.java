import javax.swing.JOptionPane;

public class Retangulo extends Quadro {
	
	public Retangulo(double area, double perimetro) {
		super(area, perimetro);
		// TODO Auto-generated constructor stub
	}

	public double base, altura;
	
	void Calculo() {
		String aux = JOptionPane.showInputDialog(null, "Digite a base");
		base = Double.parseDouble(aux);
		
		aux = JOptionPane.showInputDialog(null, "Digite a altura");
		altura = Double.parseDouble(aux);
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		
		JOptionPane.showMessageDialog(null, "área = " + area);
		JOptionPane.showMessageDialog(null, "Perímetro = " + perimetro);
	}
}
