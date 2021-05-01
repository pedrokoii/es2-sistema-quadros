
public class Quadro {
    
    public static double valorPapel = 10;
    public static double valorMoldura = 20;
    public static double maoDeObra = 0.05;

    public double area;
    public double perimetro;

    public double calculaValorDoServico(){
        return (area*valorPapel+perimetro*valorMoldura)*(1+maoDeObra);
    }

}
