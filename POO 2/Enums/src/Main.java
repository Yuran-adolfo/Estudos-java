import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Enums /Enumeracao -> Em um tipo de classe que representa um conjuto fixo de constantes
//        Melhoram legibilidade de codigo e sao faceis de manter
//        Sao mais  eficientes com swiches ao comparar strings
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduza um dia da semana");
        String entrada=scanner.nextLine().toUpperCase();
        Dia dia =Dia.valueOf(entrada);

//        System.out.println(dia); //Saida  domingo
//        System.out.println(dia.getNumerodia()); //Saida 1

        switch (dia){
            case SEGUNDA,
                 TERCA,
                 QUARTA,QUINTA,
                 SEXTA->{
                System.out.println("E um dia da semana");
            }
            case SABADO,DOMINGO ->{
                System.out.println("E fim de semana");
            }
        }
    }
}
