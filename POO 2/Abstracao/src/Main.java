import Formas.*;

public class Main {

    public static void main(String[] args) {

//        abstract -> usado para definir classes e metodos abstractos
//        Abstracao e o processo de esconder detalhes de implementacoes e mostrar apenas carracteristica essencias.
//        Classes abstractas nao podem ser instanciadas directamente, podem conter Metodos 'Bastratos' (que devem se
//        implementados) e tambem podem conter metodos 'concretos' que sao herdados.


//         Forma forma= new Forma();  Erro!
        Circulo circulo=new Circulo(4);
        Rectangulo rectangulo=new Rectangulo(2,3);
        Triangulo triangulo=new Triangulo(4,5);
//        circulo.exebicao();
        System.out.println(circulo.area());
        System.out.println(rectangulo.area());
        System.out.println(triangulo.area());
    }
}
