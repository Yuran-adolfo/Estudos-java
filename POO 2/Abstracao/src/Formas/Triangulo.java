package Formas;

public class Triangulo extends Forma{

    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return 0.5*base*altura;
    }
}
