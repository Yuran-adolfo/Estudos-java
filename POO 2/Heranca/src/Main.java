import Transportes.*; //Importando o pacote

public class Main {

    public static void main(String[] args) {

        //Heranca -> E o processo onde uma classe adquire os atributos e metodos de outra classe

        Carro carro=new Carro();
//        carro.andar();
        carro.velocidade=40;
        System.out.println(carro.velocidade);
        System.out.println(carro.numeroDeRodas);
        System.out.println(carro.numeroDePortas=4);

        Bicicleta bicicleta=new Bicicleta();

//        bicicleta.andar();
        bicicleta.velocidade=20;
        System.out.println(bicicleta.velocidade);
        System.out.println(bicicleta.pedais);
    }
}
