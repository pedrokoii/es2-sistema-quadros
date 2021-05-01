public class Circunferencia extends Quadro {
	public double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
        area();
        perimetro();
    }

    public void area(){
        this.area = Math.PI * Math.pow(raio, 2);
    }

    public void perimetro(){
        this.perimetro = 2 * Math.PI * raio;
    }
}
