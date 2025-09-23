public final class Funcionario extends Pessoa{ //A classe funcionario e uma sub-classe da classe pessoa, mas nehuma classe pode ser sub-classe dela

     final  double salario=8549.00;
    double tempoDeTrabalho;

    public final void exibirInformacao(){ //Esse metodos nao pode ser usado sub-sclasses
        System.out.println("Nome: "+nome);
        System.out.println("Morada: "+morada);
        System.out.println("Anos: "+anos);
        System.out.println("Salario: "+salario);
        System.out.println("Tempo de trabalho: "+tempoDeTrabalho);
    }

}
