public class Main {

    public static void main(String[] args) {

        Calculadora calculadora=new Calculadora();
        Carro carro=new Carro("Toyota","Land cruiser",2019);

        carro.mostrarInfo(); //Chamando o metodod

        System.out.println(calculadora.dobro(5)); //Saida 10
        System.out.println(calculadora.somar(2,2));//saida  4

    }
}
