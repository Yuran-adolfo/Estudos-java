public class Gato {

    //Atributos
    public static int contartGatos=0;
    String nome;
    int anos;
    int vidasRestante;

    public Gato(){ //Toda vez que um gato for instanciado vai incrementar
        contartGatos++;
    }
    public void meow(){
        System.out.println("Meow");
    }

    public static int getContartGatos() {
        return contartGatos;
    }
}
