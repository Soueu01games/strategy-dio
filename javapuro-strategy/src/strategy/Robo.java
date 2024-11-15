package strategy;
public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
//Anotações para estudar depois
/*
*Determina que o robo terá um comportamento ligado a mover
*A maneira que for se mover depende da classe
*/