public class Carro { //classe

    //Atributos
    String marca;
    String modelo;
    int ano;

    //metodos


    public Carro(String marca, String modelo, int ano) { //Metodo construtor
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInfo(){ //Metodo que nao retorno
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }
}
