public class Main {

    static int somar(int a ,int b){
        System.out.println("Este e o metodo sobre carregado #1");
        return a+b;
    }
    static int somar(int a ,int b,int c){
        System.out.println("Este e o metodo sobre carregado #2");
        return a+b+c;
    }
    static  double somar(double a,double b){
        System.out.println("Este e o metodo sobre carregado #3");
        return a+b;
    }
    static double somar(double a ,double b,double c){
        System.out.println("Este e o metodo sobre carregado #4");
        return a+b+c;
    }

    public static void main(String[] args) {

//        Method Overloading ou Metodos sobrecaregados-> sao metodos que compartilham o mesmo nome mas tem parametros dife
//        rentes, (nome do metodo+ parametros=assinatura do metodo)

        System.out.println(somar(1,5)); //Saida 6
        System.out.println(somar(2,5,6)); //saida 13
        System.out.println(somar(4.2,6.3));//Saida 10.5
        System.out.println(somar(5.4,6.5,3.0));//Saida 14.9
    }

}
