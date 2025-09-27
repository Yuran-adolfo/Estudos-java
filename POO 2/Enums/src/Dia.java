public enum Dia {

    //Constates
    DOMINGO(1),SEGUNDA(2),
    TERCA(3),QUARTA(4),
    QUINTA(5),SEXTA(6),
    SABADO(7);

    private final int numerodia;

    Dia(int numerodia) {
        this.numerodia = numerodia;
    }

    public int getNumerodia() {
        return numerodia;
    }
}
