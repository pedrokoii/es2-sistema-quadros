
public class Principal {

	public static void main(String[] args) {
		Retangulo quadroRetangulo1 = new Retangulo(0.1, 0.1);
		System.out.printf("Área do quadro: %.2f\n", quadroRetangulo1.area);
		System.out.printf("Perimetro do quadro: %.2f\n", quadroRetangulo1.perimetro);


		Circunferencia quadroCircunferencia1 = new Circunferencia(0.1);
		System.out.printf("Área do quadro: %.2f\n", quadroCircunferencia1.area);
		System.out.printf("Perimetro do quadro: %.2f\n", quadroCircunferencia1.perimetro);
		System.out.printf("Valor do serviço: R$%.2f\n", quadroCircunferencia1.calculaValorDoServico());
	}

}
