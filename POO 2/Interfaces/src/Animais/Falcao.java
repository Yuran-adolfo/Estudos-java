package Animais;

import Interfaces.Predador;

public class Falcao implements Predador {
    @Override
    public void cacar() {
        System.out.println("O falcao esta esta a cacar");
    }
}
