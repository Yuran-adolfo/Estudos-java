public class Main {

    public static void main(String[] args) {
//
//        Metodo encadeado-> é uma técnica de programação em linguagens orientadas a objetos que permite chamar vários
//        métodos de um objeto em uma única instrução contínua.

        String nome="Walter";
//        nome.concat("da silvia");
//        nome.toUpperCase();
//        nome.trim();

        nome.concat("Silvia").
                toUpperCase().
                trim();
        System.out.println(nome);
    }
}
