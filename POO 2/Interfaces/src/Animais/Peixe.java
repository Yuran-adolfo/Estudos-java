package Animais;
import Interfaces.*;

public class Peixe implements Presa,Predador {

    @Override
    public void fugir(){

        System.out.println("O peixe esta nadando para longe");
    }
    @Override
    public void cacar(){

        System.out.println("O peixe esta cacando!");
    }
}
