package Formas;

public class Rectangulo extends Forma{

    double  comprimeto;
    double largura;

    public Rectangulo(double comprimeto, double largura) {
        this.comprimeto = comprimeto;
        this.largura = largura;
    }

    @Override
    public double area(){
        return comprimeto*largura;
    }
}
