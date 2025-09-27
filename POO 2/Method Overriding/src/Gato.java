public class Gato extends Animal{

    @Override
    public void fazerSom(){
        super.fazerSom(); //chamando o metodo da super classe
        System.out.println("miau miau");
    }
}
