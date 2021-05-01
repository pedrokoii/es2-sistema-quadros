
public class Principal {

	public static void main(String[] args) {
		Retangulo quadroRetangulo1 = new Retangulo(0.1, 0.1);
		System.out.printf("--- Quadro Retangular ---\n");
		System.out.printf("Area do quadro: %.2f\n", quadroRetangulo1.area);
		System.out.printf("Perimetro do quadro: %.2f\n", quadroRetangulo1.perimetro);
		System.out.printf("Valor do servico: R$%.2f\n\n", quadroRetangulo1.calculaValorDoServico());

		Circunferencia quadroCircunferencia1 = new Circunferencia(0.1);
		System.out.printf("---- Quadro Circular ----\n");
		System.out.printf("Area do quadro: %.2f\n", quadroCircunferencia1.area);
		System.out.printf("Perimetro do quadro: %.2f\n", quadroCircunferencia1.perimetro);
		System.out.printf("Valor do servico: R$%.2f\n", quadroCircunferencia1.calculaValorDoServico());
	}

}
