public class Main {

    public static void main(String[] args) {

        Gato meugato=new Gato();

        meugato.meow();
        meugato.nome="paciencia";
        meugato.anos=3;
        meugato.vidasRestante=9;
        System.out.println(Gato.getContartGatos()); //chamando metodo

//        Gato.nome; nao pode pois o atriubuto nome nao e estatico, isso significa que so pode ser acessado
        //atraveis de objectos individuais


    }
}
