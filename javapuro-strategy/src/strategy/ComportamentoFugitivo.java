package strategy;
public class ComportamentoFugitivo implements Comportamento{
    
    @Override
    public void mover(){
        System.out.println("Fugindo...");
    }

}
//Anotações para estudar depois
/*
*A classe implementou mover por causa da interface
*E determinou o que acontece se for usada
*/