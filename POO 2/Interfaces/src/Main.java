import Animais.*;
public class Main {

    public static void main(String[] args) {


        // Interafaxe-> Uma interafce e um modelo para classe. Ela especifica um conjunto de metodos abstratos
        //que qualquer classe de implementacao deve definir.
        //Suporta multipla heranca como comportamento.
        //Uma classe pode herdar de uma e unica classe mas pode implementar mais do que um interface

        Coelho coelho=new Coelho();
        Falcao falcao =new Falcao();
        Peixe peixe=new Peixe();


        coelho.fugir();
        falcao.cacar();
        peixe.fugir();
        peixe.cacar();

    }
}
