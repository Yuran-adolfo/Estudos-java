package Formas;

public class Circulo extends Forma{

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI*raio*raio;
    }
}
