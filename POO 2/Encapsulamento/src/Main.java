public class Main {

    public static void main(String[] args) {

//        encapsulameto -> Atriubutos de uma classe vao estar escondidas ou privadas, podem ser acessados apenas
//        atraves de metodos (getters e setters). Devemos marcar atributos privados quando nao ha rasao para marcar
//       como public ou protected

        Carro carro=new Carro("Toyota","spacio", 2006);

//        System.out.println(carro.marca); nao pode
        System.out.println(carro.getMarca()); //Saida Toyota
    }
}
